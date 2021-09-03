package DeQueueProgram;


import java.util.*;

public class Example 
{
	private List<Integer> deque = new ArrayList<Integer>();
	
	public void insertFront(int item)
	{
		System.out.println("add at front: "+item);
		deque.add(0,item);
		System.out.println(deque);
		
	}
	
	public void insertRear(int item)
	{
		System.out.println("add at Rear: "+item );
		deque.add(item);
		System.out.println(deque);
	}
	
	public void removeFront()
	{
		if(deque.isEmpty())
		{
			System.out.println("Deque underflow! unable to remove");
		return;
		
		}
		int rem = deque.remove(0);
		System.out.println("remove the front "+rem);
		System.out.println(deque);
	}
	
	public void removeRear()
	{
		if(deque.isEmpty())
		{
			System.out.println("deque underflow unable to remove");
		return;
		}
		int rem = deque.remove(deque.size()-1);
		System.out.println("remove the front "+rem);
		System.out.println(deque);

	}
	
	
	public int peekFront()
	{
		int item = deque.get(0);
		System.out.println("Element of first "+item);
		return item;
	}
	
	public int peekRear()
	{
		int item = deque.get(deque.size()-1);
		System.out.println("Element of first "+item);
		return item;
	}

	public static void main(String[] args)
	{
		Example  e= new Example();
		e.insertFront(34);
		e.insertRear(45);
		e.removeFront();
		e.removeFront();
		e.removeFront();
		e.insertFront(21);
		e.insertFront(98);
		e.insertRear(5);
		e.insertFront(43);
		e.removeRear();
		e.removeFront(); 
		

	}

}
