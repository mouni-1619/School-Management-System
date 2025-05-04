package org.QueuePractise.com;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
public static void main(String[] args) {
Queue< Integer>q=new PriorityQueue<Integer>();
q.offer(19);
q.offer(29);
q.offer(39);
q.offer(9);
System.out.println(q);
q.remove();
System.out.println(q);
System.out.println(q.size());
q.peek();
System.out.println(q.peek());
}
}
