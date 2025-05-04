package org.ListInterfacePractise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class List_UseArrayListClass {// With out generics
	public static void main(String[] args) {
		List l1=new ArrayList();//Defalt Constrecter
		l1.add("hii");
		l1.add("aaaa");
		l1.add('c');
		l1.add(20);
		l1.add(30.55);
		List l2=new ArrayList(l1);//Collection parameter
		l2.add(100);
		l2.add(false);
		List l3=new ArrayList(20);//int capacity
		l3.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("for traversing use index valuse");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("Useint interater() in Iteracle interface");
		Iterator i=l2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Using listIterate() is present in List Interface forward direction");
		ListIterator i2=l3.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("Using listIterate() is present in List Interface Backward direction");
		ListIterator i3=l3.listIterator(l3.size());
		while(i3.hasPrevious()) {
			System.out.println(i3.previous());
		}
		Spliterator s=l3.spliterator();
		Spliterator s1=s.trySplit();
		System.out.println("----use Spliterate() -------");
		System.out.println(s.characteristics());// it returns integer values
		System.out.println("Size :"+s.getExactSizeIfKnown());
		s.forEachRemaining((a)->System.out.println(a));
		System.out.println("----use TrySplit() present in SplitIterater-----");
		System.out.println("Size :"+s1.getExactSizeIfKnown());
		System.out.println("Size :"+s1.estimateSize());
		s1.forEachRemaining((a)->System.out.println(a));
		System.out.println("----use TrySplit() present in SplitIterater agin pring -----");
		s1.forEachRemaining((a)->System.out.println(a));//returns all values
		Spliterator s3=l3.spliterator();
		Spliterator s4=s3.trySplit();
		System.out.println("------use trversing perpase tryAdvance()---------");
		s3.tryAdvance((a)->System.out.println(a));//returns one value
		System.out.println("Size :"+s3.getExactSizeIfKnown());
		s4.tryAdvance((a)->System.out.println(a));
		System.out.println("Size :"+s4.getExactSizeIfKnown());
		
		List ll=Arrays.asList(1,2,3,4,5);
		List ll2=new ArrayList<Integer>();
		ll2.add(10);
		ll2.add(11);
		ll2.add(12);
		System.out.println(ll);
		System.out.println(ll2);
		ll2.retainAll(ll);
		System.out.println(ll);
		System.out.println(ll2);
		
		
		
	}

}
