package org.MultyThreading.com;

public class ThreadRunner {
	public static void main(String[] args) throws InterruptedException  {
		ExmapleThread thread1=new ExmapleThread("1 st Thread");
		thread1.setPriority(4);
//		thread1.start();
		ExmapleThread thread2=new ExmapleThread("2 nd Thread");
		thread2.sleep(10, 10);
		thread2.setPriority(1);
		ExmapleThread thread3=new ExmapleThread("3 rd Thread");
		thread3.setPriority(7);
//		thread2.join();
		thread2.start();
		thread1.start();
		thread3.start();
		System.out.println(thread1.getId()+" id of 1 st thread");
		System.out.println(thread1.getClass()+" Class name of 1 st thread");
		System.out.println(thread1.getStackTrace()+" stack trace of thread 1");
		System.out.println("-----------Example 2-----------");
		Example2 e1=new Example2(0);
		Example2 e2=new Example2(0);
		e1.start();
		e2.start();
		
		e1.join();
		e2.join();
//		System.out.println(e1.n);
//		System.out.println(e2.n);
		
	}

}
