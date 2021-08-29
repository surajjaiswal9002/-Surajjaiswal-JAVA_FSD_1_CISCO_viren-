package Assignment;

abstract class pen
{
	abstract void write();
	
	abstract void refill();
	
	
	
}

 class fountain_Pen extends pen
{
	@Override
	void write() {
		System.out.println("Written in the copy");
		
	}
	@Override
	void refill() {
		System.out.println("Refill the pen");
		
	}
	
	void Nib()
	{
		System.out.println("Nib method");
	}
}


class monkey
{
	void jump()
	{
		System.out.println("Monkey jump");
	}
	
	void bite()
	{
		System.out.println("Monkey bite ");
	}
}


class human extends monkey implements animal
{

	@Override
	public void eat() {
		System.out.println("Monkey eating banana");
		
	}

	@Override
	public void sleep()
	{
		System.out.println("Monkey sleeping");
		
	}
	
}

interface animal
{
	void eat();
	
	void sleep();
	
	
}


public class Ass_003_practice {

	public static void main(String[] args) 
	{
		fountain_Pen p = new fountain_Pen();
		p.write();
		p.refill();
		p.Nib();
				
		System.out.println("---------------------------");
		
		human h = new human();
		h.bite();
		h.eat();
		h.jump();
		h.sleep();
		
		
		

	}

}
