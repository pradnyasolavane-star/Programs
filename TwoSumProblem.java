package programTask2;

import java.util.Scanner;

public class TwoSumProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

            for (int i = 0; i < n; i++) 
           {
              System.out.print("enter elemmts of array:");
               arr[i] = sc.nextInt();
             }
            System.out.print("array: ");
            for (int i = 0; i <n; i++)
            {
	            System.out.print(arr[i] + " ");
	        }
            System.out.print("\nenter target:");
            int target=sc.nextInt();
            int sum=0;
            
		     for (int i = 0; i < arr.length - 1; i += 2) 
		     {
		                sum=arr[i]+arr[i+1];
		                if(sum==target)
		                {
		                	System.out.println((i)+","+(i+1));
		                }
		     } 
		       sc.close();

	}

}
