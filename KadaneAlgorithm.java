package programTask2;

import java.util.Scanner;

public class KadaneAlgorithm {

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
            int sum=0;
             int[] temp=new int[n-1];
		     for (int i = 0; i < arr.length - 1; i += 2) 
		     {
		                sum=arr[i]+arr[i+1];
		                temp[i]=sum;
		     }
		     for (int i = 0; i<temp.length; i++)
	            {
		            System.out.print("\n"+temp[i]+" ");
		        }
		     int max=temp[0];
		     for(int i=0;i<temp.length;i++)
		     {
		    	 if(max<temp[i])
		    	 {
		    	
		    		 max=temp[i];
		    	 }
		    	 
		     }
		     System.out.println("\nthe maximum subarray sum is:"+max);
		       sc.close();


	}

}
