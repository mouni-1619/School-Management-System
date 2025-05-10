package org.CustomerTask.com;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CustomerMap {

 public static Map<String, Customer> getMap(){
	 Map<String, Customer> map = new HashMap<>();
	    map.put("C1", new Customer("C1", "Alice", "USA", 28, 2, 3500.0, 3, 12));
	    map.put("C2", new Customer("C2", "Bob", "India", 35, 6, 7000.0, 5, 40));
	    map.put("C3", new Customer("C3", "Charlie", "India", 42, 4, 1500.0, 2, 8));
	    map.put("C4", new Customer("C4", "David", "India", 30, 1, 2500.0, 1, 5));
	    map.put("C5", new Customer("C5", "Eva", "USA", 50, 10, 8000.0, 6, 70));
	    map.put("C6", new Customer("C6", "Frank", "India", 24, 2, 3000.0, 3, 9));
	    map.put("C7", new Customer("C7", "Grace", "India", 38, 3, 4200.0, 2, 15));
	    map.put("C8", new Customer("C8", "Helen", "India", 44, 5, 5500.0, 5, 33));
	    map.put("C9", new Customer("C9", "Ian", "USA", 29, 1, 2100.0, 3, 6));
	    map.put("C10", new Customer("C10", "Jake", "India", 27, 4, 4700.0, 4, 20));
	    map.put("C11", new Customer("C11", "Kira", "India", 31, 3, 2800.0, 2, 14));
	    return map;
}
}
