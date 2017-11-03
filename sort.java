package bubblesort;

public class sort 
{
	public static  void buble_sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)//average case and worst case
		{	//complexity is o(n*n)
			//best cases complexity is o(n)
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])//swapping elements 
				{//if we want descending array swipe the condition
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			//best case complexity is o(n) this occur when array is sorted
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//printing sorted elements
		}
	}
	public static void main(String []args)
	{
		 sort ob = new sort();
	        int arr[] = {64, 34, 25, 12, 22, 11, 90};
	        ob.buble_sort(arr);
	}
}
