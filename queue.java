import java.util.*;
public abstract class queue implements Comparable
{public static void main(String[]args)
	{PriorityQueue<String> queue=new PriorityQueue<String>(); 
	PriorityQueue<String> q=new PriorityQueue<String>(); 
	queue.add("Amit");//note that adding the elements in queue is based on natural ordering
	queue.add("Vijay");//on natural ordering ie based on id that is  
	queue.add("Karan");//created during process of adding the elements  
	queue.add("Jai");  //this procces is sloved by impleming the interface Comparable
	queue.add("Rahul");  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	} 
	//removing the head elements
	queue.remove();  
	queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  

	
	
	}
}
}


