package hello.java;
import java.util.*;
public class world 
{public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter elements of array");
		for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();//to take input from user
		System.out.println("traversing elements of array");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);//traversing of array
		//searching for elements
		int key=5;//example programs point of view
		for(int i=0;i<a.length;i++)
			{if(a[i]==key)
				break;
			}
		System.out.println("element is present in the array");
		//addition of elements in the array
		System.out.println("enter the number want to add in the array");
		int w=sc.nextInt();
		//converting current array to array list
		//List<int> cardsList = Arrays.asList(a);
		List<Integer> list = new ArrayList<>(a.length);//converting normal integer array to array list for deletion and addition of elements
		for(int i:a)
			list.add(Integer.valueOf(i));//adding values to the created array list
		list.add(w);
		System.out.println(list);
		//element that you want delete in the array
		System.out.println("enter the number that you want to delete from array");
		int PId=sc.nextInt();
		Iterator<Integer> it =  list.iterator();    //creating reference of iterator
		while(it.hasNext())//used as flag while iterating through elements of list
		{
		   if(it.next()== PId)//comparing the elements with integer value given by the user
		   it.remove();//delete the value
		}
		System.out.println(list);
	}
}
