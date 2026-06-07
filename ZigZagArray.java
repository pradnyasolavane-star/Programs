package programTask2;
import java.util.*;
public class ZigZagArray {

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
		            System.out.print("Original: ");
		            for (int i = 0; i <n; i++)
		            {
			            System.out.print(arr[i] + " ");
			        }
				     for (int i = 0; i < arr.length - 1; i+=2) 
				     {
				            int temp = arr[i];
				            arr[i] = arr[i + 1];
				            arr[i + 1] = temp;
				       }

				        System.out.print("\nAfter:  ");
				        for (int i = 0; i <n; i++)
				        {
				            System.out.print(arr[i] + " ");
				        }
				       sc.close();
		
	}

}
