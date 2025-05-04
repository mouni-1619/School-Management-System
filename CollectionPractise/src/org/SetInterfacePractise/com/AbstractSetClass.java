package org.SetInterfacePractise.com;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AbstractSetClass extends AbstractSet<Integer> {
	private Integer[] elements;
    private int size;

	public AbstractSetClass(Integer[] elements) {
		super();
		this.elements = elements;
		this.size = elements.length;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		 return new Iterator<Integer>() {
	            private int index = 0;
	            
	            @Override
	            public boolean hasNext() {
	                return index < size;
	            }
	            
	            @Override
	            public Integer next() {
	                if (!hasNext()) {
	                    throw new NoSuchElementException();
	                }
	                return elements[index++];
	            }

	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException("remove not supported");
	            }
	        };
	}
	public static void main(String[] args) {
		 Integer[] arr = {10, 20, 30, 40, 50};
		 AbstractSetClass a=new AbstractSetClass(arr);
		 System.out.println("AbstractSet :");
		 for(int i:a) {
			 System.out.println(i);
		 }
		 System.out.println("Abstract Methods of Set useing");
		 System.out.println(" Use Contsind mrthod 30 is present are not: "+a.contains(30));
		 System.out.println("Use contains methods 100 is present are not :"+a.contains(100));
		 System.out.println("Checking isempty method :"+a.isEmpty());
		 System.out.println("Checking the size :"+a.size);
		 Object[]ar=a.toArray();
		 for(Object i:ar) {
			 System.out.println(i);
		 }
		 System.out.println("Checking hashcode Method :"+a.hashCode());
	}

}
