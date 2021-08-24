package org.Cisco.Oops;

class vechile
{
	//method 
	void run()
	{
		System.out.println("run the vechile..");
	}
	
	void stop()
	{
		System.out.println("Stop the vechile");
	}
	

	void fuel(int price)
	{
		price = 85;
		System.out.println( "Inside method int "+price);
	}
	
	void fuel(float Deseal ,String name)
	{
		name ="Deseal";
		Deseal = 77.8f;
		
		System.out.println("Inside method fuel float & String " +Deseal+ " " +name);
	}
	void fuel(char c , int i)
	{
		c ='M';
		i =2021;
		System.out.println("Inside method fuel char & int " +c+ " "+i);
	}
	
	
	vechile()    
	{
		System.out.println("Default Constructor..");
	}
	

	int speed  = 10;
	long distance = 100;
	
	vechile(int speed, long distance)
	{
		this.speed =speed;
		this.distance = distance;
	}	
}

//------------Two  Wheeler------
class Two_wheeler extends vechile
{
	@Override
	void run()
	{
		System.out.println("run the vechile..");
	}
	
	@Override
	void stop()
	{
		System.out.println("stop the vechile");
	}
	
	
	Two_wheeler()
	{
		super();
		System.out.println("Inside the Two_Wheeler "+super.speed+" "+super.distance);
		
	}
	
	int speed = 40;
	long distance =200;
	int no_of_tyre = 2;
	
	
	void display()
	{
		System.out.println("Inside the Two_Wheeler speed = " +speed+ " distance = " +distance+ " no_of_tyre = " +no_of_tyre);
		
	}
}


//---------Three Wheeler--------------
class Three_Wheeler extends vechile

{
	@Override
	void run()
	{
		System.out.println("run the vechile");
	}
	
	@Override
	void stop()
	{
		System.out.println("stop the vechile");
	}
	
	Three_Wheeler()
	{
		super();
		System.out.println("Inside the Three_Wheeler "+super.speed+" "+super.distance);
		
	}

	
	int speed = 60;
	long distance =300;
	int no_of_tyre = 3;
	
	
	void display()
	{
		System.out.println("Inside the Three_Wheeler  speed = "+speed+ " distance = "+distance+ " no_of_tyre = "+no_of_tyre);
	
	}
	
	
}
//--------four wheeler---------
class Four_Wheeler extends vechile
{
	@Override
	void run()
	{
		System.out.println("run the vechile");
	}
	
	@Override
	void stop()
	{
		System.out.println("stop the vechile");
	}
	
	Four_Wheeler()
	{
		super();
		System.out.println("Inside the Four_Wheeler "+super.speed+" "+super.distance);
	}
	
	int speed = 80;
	long distance =400;
	int no_of_tyre =4;
	
	
	void display()
	{
		System.out.println("Inside the Four_Wheeler  speed = "+speed+ " distance = "+distance+ " no_of_tyre = "+no_of_tyre);
		
	}
	
}
// --- Eight Wheeler----
class Eight_Wheeler extends vechile
{
	@Override
	void run()
	{
		System.out.println("Run the the vechile");
	}
	
	@Override
	void stop()
	{
		System.out.println("Stop the the vechile");
	}
	
	Eight_Wheeler()
	{
		super();
		System.out.println("Inside the Eight_Wheeler " +super.speed+" "+super.distance);
	}
	
	int speed = 100;
	long distance =800;
	int no_of_tyre =8;
	
	
	void display()
	{
		System.out.println("Inside the Eight_Wheeler speed = "+speed+ " distance = "+distance+ " no_of_tyre = "+no_of_tyre);
		
	}
	
	
}

//Main method
public class Assignment_4 
{
	
	public static void main(String[] args) 
	{
		
		vechile v = new vechile(10, 100);
		v.run();
		v.stop();
		v.fuel(99);
		v.fuel('P', 100);
		v.fuel(88.8f, "Diseal");
		
		System.out.println();
		
		System.out.println("-----Two Wheeler-----");
		Two_wheeler v1 = new Two_wheeler();
		v1.run();
		v1.stop();
		v1.display();
		
		System.out.println();
		
		System.out.println("-----Three Wheeler-----");
	     Three_Wheeler v2 = new Three_Wheeler();
		v2.run();
		v2.stop();
		v2.display();
		
		
		System.out.println();
		
		System.out.println("-----Four Wheeler-----");
		Four_Wheeler v3 = new Four_Wheeler();
		v3.run();
		v3.stop();
		v3.display();
		
		
		System.out.println();
		
		System.out.println("-----Eight Wheeler-----");
		Eight_Wheeler v4 = new Eight_Wheeler();
		v4.run();
		v4.stop();
		v4.display();
		
		
		
	
		
		
	
		
		
//		
		
		
	}

}
