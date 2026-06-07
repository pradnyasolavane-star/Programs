package programTask2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonEleArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of first array:");

	        int n = sc.nextInt();

	        int[] arr1 = new int[n];

	        System.out.println("Enter first array elements:");

	        for(int i = 0; i < n; i++)
	        {

	            arr1[i] = sc.nextInt();
	        }

	       
	        int[] arr2 = new int[n];

	        System.out.println("Enter second  array elements:");

	        for(int i = 0; i < n; i++)
	        {

	            arr2[i] = sc.nextInt();
	        }
	        Set<Integer> set = new HashSet<>();
	        for (int i = 0; i < arr1.length; i++) {
	            set.add(arr1[i]);
	        }
	        int[] result=new int[n];
	        int ele=0;
           for(int i=0;i<n;i++)
           {
        	   ele=arr2[i];
        	   if(set.contains(arr2[i]))
        	   {
        		   result[i]=ele;
        	   }
        	   else
        	   {
        		   continue;
        	   }
           }
           System.out.print("common elements:");
           for(int i=0;i<result.length;i++)
           {
        	   System.out.print(result[i]+" ");
           }
           sc.close();
	}

}
