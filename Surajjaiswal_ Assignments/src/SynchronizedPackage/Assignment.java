package SynchronizedPackage;

class customer
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw..");
		if(this.amount < amount)
		{
			System.out.println("Less balance wait for deposit");
			try
			{
				wait();
			}
			catch(Exception e){}		
		}
		this.amount -= amount;
		System.out.println("Withdraw completed .. the rest amount is "+this.amount);
		
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("going deposit  ");
		this.amount += amount;
		
		System.out.println("Deposite completed ...."+this.amount);
		notify();
	}
	
}




public class Assignment {

	public static void main(String[] args)
	{
		
		final customer c = new customer();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(5000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(4000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(10000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.deposit(20000);
			}
		}
		.start();
	}

}
