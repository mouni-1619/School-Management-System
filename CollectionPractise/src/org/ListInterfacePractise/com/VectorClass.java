package org.ListInterfacePractise.com;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorClass {
public static void main(String[] args) {
	Vector<Integer> l=new Vector<Integer>();
	l.add(2);
	l.add(12);
	l.add(21);
	l.add(20);
	l.add(22);
	Enumeration<Integer>e=l.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	System.out.println("---------------");
	Enumeration<Integer>e1=l.elements();
	Iterator<Integer> i=e1.asIterator();
	while(i.hasNext()) {
		if(i.next()==22) {
			i.remove();
		}else {
		System.out.println(i.next());
		}
	}
}
}
