package programTask2;
import java.util.*;
public class RemoveDuplicateEle
{
   public static void main(String[] args)	
   {
	           Scanner sc = new Scanner(System.in);

	           System.out.print("enter size of array:");
	           int n = sc.nextInt();
	           int[] arr = new int[n];
	           
	           for (int i = 0; i <n; i++) {
	               System.out.print("enter elemmts of array:");
	               arr[i] = sc.nextInt();
	           }
	           for (int i = 0; i < n - 1; i++) {
	               for (int j = 0; j < n - i - 1; j++) {
	                   if (arr[j] > arr[j + 1]) {
	                       int temp = arr[j];
	                       arr[j] = arr[j + 1];
	                       arr[j + 1] = temp;
	                   }
	               }
	           }
	           int j = 0;
	           for (int i = 0; i < n - 1; i++) {
	               if (arr[i] != arr[i + 1]) {
	                   arr[j] = arr[i];
	                   j++;
	               }
	           }
	           arr[j] = arr[n - 1];
	           System.out.println("array after removing duplicates:");
	           for (int i = 0; i < j + 1; i++) {
	               System.out.println(arr[i] + "\t");
	           }

	           sc.close();
	       }

   }


