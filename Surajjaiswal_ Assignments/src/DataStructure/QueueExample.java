package DataStructure;

import java.util.NoSuchElementException;
import java.util.Scanner;

class arrayQueue
{
	protected int Queue[];
	protected int front , rear, size,len;
	
	public arrayQueue(int n )
	{
		size = n;
		len =0;
		Queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	
	//insert the element
	public void insert(int i)
	{
		if(rear == -1)
		{
			front = 0;
			rear = 0;
			Queue[rear] =i;
		}
		else if(rear +1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception ");
		else if(rear +1 <= size)
			Queue[++rear]=i;
			len++;
	}
	
	//remove the element
	public int remove()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow");
		}
		else
		{
			len--;
			int ele=Queue[front];
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
				
			}else
				front++;
			return ele;
		}
	}
	
	//check the front element of queue
	public int peek()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Underflow ");
		}
		else
			return Queue[front];
	}
	


//check the Queue is empty or not
	public boolean isEmpty() 
	{
		return front == -1;
	}
	
	//check full
	public boolean isFull()
	{
		return front == 0 && rear== size-1;
	}
	
	//check size
	public int isSize()
	{
		return len;
	}
	
	
	//display 
	public void display()
	{
		System.out.println("\nQueue= ");
		if(len ==  0)
		{
			System.out.println("Empty\n");
			return;
		}
		for(int i = front ;i<=rear;i++)
			System.out.println(Queue[i]+" ");
		System.out.println();
	}
}



public class QueueExample {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		
		//creating an object of thje class arrayQueue
		arrayQueue aq = new arrayQueue(n);
		
		
		char ch;
		do {
			System.out.println("\nQueue operation");
			System.out.println("1. insert");
			System.out.println("2.remove");
			System.out.println("3.peek");
			System.out.println("4.check empty");
			System.out.println("5. check full");
			System.out.println("6.size");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter integer element to insert");
				try
				{
					aq.insert(sc.nextInt());
				}
				catch (Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 2 :
				try
				{
					System.out.println("Remove Element :"+aq.remove());
				}
				catch(Exception e)
				{
					System.out.println("Error :"+e.getMessage());
				}
				break;
			case 3:
				try
				{
					System.out.println("peek Element : "+aq.peek());
				}
				catch (Exception e) 
				{
					System.out.println("Error :"+e.getMessage());
				}
				break;
			case 4 :
				try
				{
					System.out.println("Check Empty : "+aq.isEmpty());
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 5:
				try
				{
					System.out.println("Check Full : "+aq.isFull());
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
				break;
			case 6:
				try
				{
					System.out.println("Size  : "+aq.isSize());
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
			default : System.out.println("Wrong Entry \n");
			break;
			}
			aq.display();
			System.out.println("\nDo you ant to continue(Type y or n)\n");
			ch = sc.next().charAt(0);
		}while(ch== 'Y' || ch == 'y');

	}

}
