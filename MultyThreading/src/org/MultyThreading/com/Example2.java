package org.MultyThreading.com;

public class Example2 extends Thread {
int n;
public Example2(int n) {
	this.n=n;
}
public void run() {
	synchronized (this) {
		
	System.out.println(" before increment "+n);
	for(int i=0;i<500;i++) {
		n++;
	}
	System.out.println("After Increment "+n);
	}
}
}
