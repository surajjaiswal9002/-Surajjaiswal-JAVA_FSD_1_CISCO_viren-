package QueueExp;

import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PrioritytyQueueExp 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("India");
		q.add("China");
		q.add("US");
		q.add("Australia");
		q.add("Russia");
		q.add("Indonesi");
		q.add("Pakistan");
		
		
		System.out.println("Priority queue element "+q);
		
//		System.out.println("Itrerating the queue elements :");
//		java.util.Iterator<String> i = q.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		q.remove("India");
		q.remove("Pakistan");
		System.out.println("Priority queue element "+q);
		
		q.add("Iran");
		q.add("thiland");
		System.out.println("Add to element"+q);
		
		q.peek();
		System.out.println("Show the 1st value "+q);
		
		

	}

}
