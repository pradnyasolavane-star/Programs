package programTask2;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements "+n +"of array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter elemmts of array:");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int t=0;
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				 t=max;
				max=arr[i];
			}
		}
		System.out.println("the lagest element is :"+max);
		System.out.println("the second largest no in array is :"+t);
		sc.close();
	}

}
