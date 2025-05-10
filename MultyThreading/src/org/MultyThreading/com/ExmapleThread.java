package org.MultyThreading.com;

public class ExmapleThread extends Thread {
	public ExmapleThread(String s) {
		System.out.println(s);
	}
public void run() {
	System.out.println(getPriority());
}
}
