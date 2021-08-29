package Thread;

public class SleepThread extends Thread
{
  public void run()
  {
	  for(int i = 1 ;i<=4;i++)
	  {
		  try
		  {
			  Thread.sleep(2000);
		  }catch(InterruptedException e)
		  {
			  System.out.println(e);
		  }
		  System.out.println(Thread.currentThread().getName()+" "+i);
	  }
  }
	
	public static void main(String[] args) 
	{
		SleepThread t1 = new SleepThread();
		t1.setName("JAVA");
		t1.setPriority(MAX_PRIORITY);

		SleepThread t2 = new SleepThread();
		t2.setName("PYTHON");
		t2.setPriority(MAX_PRIORITY);
		
		SleepThread t3 = new SleepThread();
		t3.setName("Oracle");
		
		SleepThread t4 = new SleepThread();
		t3.setName("C++");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());

	}

}
