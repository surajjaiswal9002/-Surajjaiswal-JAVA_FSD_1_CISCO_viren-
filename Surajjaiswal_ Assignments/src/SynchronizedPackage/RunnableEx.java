package SynchronizedPackage;

public class RunnableEx implements Runnable {
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
		try
		{
			Thread.sleep(2000);
		}
	catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
	}

	public static void main(String[] args) {
		
		RunnableEx m1 =new RunnableEx();
		Thread t1 =new Thread(m1);
		t1.setName("JAVA");
		
		RunnableEx m2 =new RunnableEx();
		Thread t2 =new Thread(m1);
		t2.setName("Python");
		
		RunnableEx m3 =new RunnableEx();
		Thread t3 =new Thread(m1);
		t3.setName("ORACLE");
		
		RunnableEx m4 =new RunnableEx();
		Thread t4 =new Thread(m1);
		t4.setName("C++");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
	}

}
