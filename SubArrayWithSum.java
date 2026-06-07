package programTask2;
import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");

        int n= sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter first array elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
       
        System.out.print("enter target:");
        int target=sc.nextInt();
        
       
        for(int i=0;i<n;i++)
        {
        	 ArrayList<Integer> al=new ArrayList<>();
        	int sum=0;
        	for(int j=i;j<n;j++)
        	{
        		sum=sum+arr[j];
        		al.add(arr[j]);
        		if(sum==target)
        		{
        			System.out.println("subarray with given sum :"+target+":"+al);			
        		}
        	}
        }
       
        
        sc.close();
	}

}
