package org.MultyThreading.com;

public class Example4 implements Runnable{
int n;
	@Override
	public void run() {
		System.out.println(" inital n: "+n);
		for(int i=0;i<1000;i++) {
			n++;
		}
		System.out.println("After n :"+n);
		
	}
	
public static void main(String[] args) throws InterruptedException {
	Example4 e=new Example4();
	Thread t1=new Thread(e);
	Thread t2=new Thread(e);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(e.n);
}
}
