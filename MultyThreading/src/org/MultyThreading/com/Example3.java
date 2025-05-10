package org.MultyThreading.com;

public class Example3 {
	
public static void main(String[] args) throws InterruptedException {
	Runnable r=new Runnable() {
		int n;
		@Override
		public void run() {
			synchronized (this) {
				
			 System.out.println(" inital n: "+n);
			for(int i=0;i<1000;i++) {
				n++;
			}
			System.out.println("After n :"+n);
		}
		}
	};
	Thread t1=new Thread(r);
	Thread t2=new Thread(r);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
}
}
