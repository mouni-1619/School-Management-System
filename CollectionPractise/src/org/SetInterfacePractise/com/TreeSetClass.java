package org.SetInterfacePractise.com;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		 TreeSet<String> treeSet = new TreeSet<>();
           // 1. Add Elements (Create)
	        treeSet.add("Apple");
	        treeSet.add("Mango");
	        treeSet.add("Banana");
	        treeSet.add("Orange");
	        treeSet.add("Grapes");

	        System.out.println("Elements after adding: " + treeSet);
	        // 2. Access Elements (Read)
	        System.out.println("\nTraversing using Iterator:");
	        Iterator<String> it = treeSet.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	        System.out.println("\nTraversing in Descending Order:");
	        Iterator<String > desit=treeSet.descendingIterator();
	        while (desit.hasNext()) {
	            System.out.println(desit.next());
	        }
	       Spliterator<String> spit=treeSet.spliterator();
	       System.out.println("Spliterater out put" );
	       spit.forEachRemaining((a)->System.out.println(a));
	        treeSet.remove("Mango");
	        System.out.println("\nAfter removing 'Mango': " + treeSet);
	        System.out.println("\nSize of TreeSet: " + treeSet.size());
	        System.out.println("\nContains 'Banana'? " + treeSet.contains("Banana"));
	        System.out.println("\nFirst element: " + treeSet.first());
	        System.out.println("Last element: " + treeSet.last());

	        // Navigation Methods
	        System.out.println("\nLower than 'Orange': " + treeSet.lower("Orange")); // just smaller
	        System.out.println("Higher than 'Banana': " + treeSet.higher("Banana")); // just greater
	        System.out.println("Floor of 'Banana': " + treeSet.floor("Banana"));     // <= given
	        System.out.println("Ceiling of 'Banana': " + treeSet.ceiling("Banana")); // >= given
	        //  SubSets
	        NavigableSet<String> headSet = treeSet.headSet("Orange", true); // up to including Orange
	        System.out.println("\nHeadSet up to Orange: " + headSet);

	        NavigableSet<String> tailSet = treeSet.tailSet("Banana", true); // from Banana inclusive
	        System.out.println("TailSet from Banana: " + tailSet);

	        NavigableSet<String> subSet = treeSet.subSet("Banana", true, "Orange", false);
	        System.out.println("SubSet from Banana (inclusive) to Orange (exclusive): " + subSet);
	        
	}

}

