package SynchronizedPackage;

class Table
{
	void printTable(int n)
	{
		System.out.println("I m in the print table method ");
	
	
	synchronized(this)
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
}

class MyThread1 extends Thread
{
	Table t ;
	
	MyThread1(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		System.out.println("Into the MyThread1 run() method ");
		t.printTable(5);
	}
}

class MyThread2 extends Thread
{
	Table t ;
	
	MyThread2(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		System.out.println("Into the MyThread2 run() method ");
		t.printTable(100);
	}
}


public class TestSysnchBlock1 
{

	public static void main(String[] args) 
	{
		
		Table t1 = new Table();
		
		
		MyThread1 m1 = new MyThread1(t1);
		MyThread2 m2 = new MyThread2(t1);
		
		m1.start();
		m2.start();
	}

}


