import java.util.*;
public class link
{	int id;
	int quant;
	String name;
	public link(int id,int quant,String name)
	{
		this.id=id;
		this.quant=quant;
		this.name=name;
		
	}
	public static void main(String[]args)
	{List<link> list=new LinkedList<link>();//creating list of books
	//creating the books
	link b1=new link(101,8,"let us c");  
	link b2=new link(102,8,"data"); 
	link b3=new link(103,8,"hero");  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(link b:list)
    {  
    System.out.println(b.id+" "+b.name+"  "+b.quant);  
	}
    list.remove(b3);  //remove one element of linklist
    for(link b:list)
    {  
    System.out.println(b.id+" "+b.name+"  "+b.quant);  
	}
}
	
}
