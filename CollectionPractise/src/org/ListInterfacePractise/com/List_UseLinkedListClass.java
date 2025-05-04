package org.ListInterfacePractise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class List_UseLinkedListClass {
	public static void main(String[] args) {
		List<String> l1=new LinkedList<String>();
		System.out.println("List empty are contain elements :"+l1.isEmpty());
		System.out.println("Size of the list is :"+ l1.size());
		l1.add("Sindhu");
		l1.add("Hari");
		l1.add("Arish");
		l1.add("Vahini");
		l1.add("Rekha");
		l1.add("Sathyanaraya");
		System.out.println("only use add() insertiro");
		System.out.println(l1);
		System.out.println("Size of the list is :"+ l1.size());
		l1.add(3, "J N V Vahini");//addinf spasific index
		System.out.println(l1);
		l1.remove(4);//removing 4 th index value
		System.out.println(l1);
		System.out.println("Size of the list is :"+ l1.size());
		l1.set(0, "K Sindhu");
		l1.set(1, "K H V Subbu");
		System.out.println(l1);//updating the valuse use set()
		System.out.println("Size of the list is :"+ l1.size());
		System.out.println("List empty are contain elements :"+l1.isEmpty());
		System.out.println("list contain "+l1.get(2)+" are not :"+l1.contains("Arish"));
		System.out.println("Index value of "+l1.get(1)+" is :"+l1.indexOf("K H V Subbu"));
		System.out.println(l1.subList(1, 3));
		System.out.println(l1.subList(1, 3).size());
		System.out.println(l1.subList(1, 3).set(1,"N Arish"));
		System.out.println(l1);
		//Split iterater not working in linkedList becose it is a nodes based acces
//		Spliterator<String >s1=l1.spliterator();
//		Spliterator<String > s2=s1.trySplit();
//		System.out.println("-------SplitErator1-----------");
//		s1.forEachRemaining((a)->System.out.println(a));
////		 s2.forEachRemaining(System.out::println);
//		System.out.println("-------SplitErator2-----------");
////		 s2.forEachRemaining(System.out::println);
//		s2.forEachRemaining((a)->System.out.println(a));
//		System.out.println(s1.getExactSizeIfKnown());
//		if (s2 != null) {
//		    System.out.println("------ SplitErator1 (first half) ------");
//		    while (s2.tryAdvance((e) -> System.out.println(e)));
//		}
//
//		System.out.println("------ SplitErator2 (second half) ------");
//		while (s1.tryAdvance((e) -> System.out.println(e)));
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(20); l2.add(10); l2.add(30); l2.add(20); l2.add(40); l2.add(50);
        System.out.println(l2);
        Iterator<Integer>i=l2.iterator();
        while(i.hasNext()) {
        	if(i.next()==30) {
        		i.remove();
        	}
        }System.out.println(l2);
	}
}
