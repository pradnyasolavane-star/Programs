package programTask2;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.print("enter size of arrray:");
	     int size=sc.nextInt();
	     int[] arr = new int[size];
         
         for (int i = 0; i <size; i++) {
             System.out.print("enter elemmts of array:");
             arr[i] = sc.nextInt();
         }
        System.out.print("enter element to search:");
        int ele=sc.nextInt();
        int l=0;
        int u=size-1;
        int flag=0;
        while(l<=u)
        {
        	int m=(l+u)/2;
        	if(ele==arr[m])
        	{
        		System.out.println("element found at position"+(m+1));
        		 flag=1;
        		break;
        	}
        	else if(ele>arr[m])
        	{
                l=m+1;       		
        	}
        	else
        	{
        		u=m-1;
        	}
        }
        if(flag==0)
        {
        	System.out.println("element not found");
        }
        sc.close();
	}

}
