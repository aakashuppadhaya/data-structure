package queueapp;
import java.util.*;
public class queueapplication implements Comparable<queueapplication> //that implements natural ordering of objects
{	String name;//if we dont implements Comparable interface program through exception as so we must overide compareto method of interface comparable
	int id;
	int quant;
	queueapplication (String name,int id,int q)
	{this.name=name;
	 this.id=id;
	 this.quant=q;
	}
	public int compareTo(queueapplication b)
		{  
	    if(id>b.id)
	    {  
	        return 1;  
	    }
	    else if(id<b.id)
	    {  
	        return -1;  
	    }
	    else
	    {  
	    return 0;
	    }
		}
public static void main(String[]args)
	{PriorityQueue<queueapplication> queue=new PriorityQueue<queueapplication>();  
    //Creating Books  
	queueapplication b1=new queueapplication("astr",1,123);  
	queueapplication b2=new queueapplication("ast",2,124);  
	queueapplication b3=new queueapplication("as",3,125);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);
    queue.add(b3);
    System.out.println("Traversing the queue elements:");  
    //Traversing queue elements  
    for(queueapplication  b:queue){  
    System.out.println(b.id+ b.name+ + b.quant);  
    }  
    queue.remove(); //removing the queue elements 
    System.out.println("After removing one book record:");  
    for(queueapplication  b:queue)
    {  
        System.out.println(b.id+b.name+ + b.quant);  
	
	}
}
}