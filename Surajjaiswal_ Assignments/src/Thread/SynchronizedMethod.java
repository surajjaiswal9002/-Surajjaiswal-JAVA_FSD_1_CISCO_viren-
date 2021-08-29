package Thread;

class Line
{
	synchronized public void getLine()
	{
		for(int i =0;i<3;i++)
		{
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

class Train extends Thread
{
	Line line;
	
	Train(Line line)
	{
		this.line = line;
	}
	
	@Override
	public void run()
	{
		line.getLine();
	}
}


public class SynchronizedMethod
{

	public static void main(String[] args)
	{
		
		Line obj = new Line();
		
		Train t1 = new Train(obj);
		Train t2 = new Train(obj);
		
		
		t1.setName("Train 1");
		t2.setName("Train 2");
		
		
		t1.start();
		t2.start();
	}

}
