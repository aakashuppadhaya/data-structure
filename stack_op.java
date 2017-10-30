package stack;
import java.util.*;
public class stack_op
{	//we have to create static methods since static method parameter cannot assign non-static method  	
	static void stack_push(Stack s)//created method for pushing element
	{	{for(int i=0;i<=10;i++)
				s.push(i);
		}
	System.out.println(s);
	}
	static void stack_pop(Stack s)//method to pop the element of stack
	{/*The method pop() in the type Stack is not applicable for the arguments (int
		 r*/
		for(int i=0;i<=10;i++)
			s.pop();
	System.out.println(s);	
	}
	static void stack_peak(Stack<Integer> s)//method to see the topmost element of stack
	{
		Integer e=(Integer)s.peek();//typecasting  stack type to Integer
		System.out.println(e);
	}
	static void stack_isempty(Stack s)//method to check whether stack is empty or not
	{
		if(s.isEmpty()==true)
			System.out.println("stack is empty");
		else
			System.out.println("stack is not empty");
	}
	static void stack_search(Stack s,int a)
	{	Integer w=s.search(a);
		System.out.println(w);
		
	}
	
	public static void main(String []args)
	{Stack s = new Stack();//created a reference of class stack to use stack functionality
	stack_push(s);
	stack_pop(s);
	stack_push(s);
	stack_peak(s);
	stack_isempty(s);
	stack_search(s,2);/*note stack search function start searching according to top to bottom
						since i have mention the parameter 2 it returns me the 2nd position of stack ie
						9
					*/

}
}
