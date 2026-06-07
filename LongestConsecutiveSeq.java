package programTask2;
import java.util.*;
public class LongestConsecutiveSeq {

	public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter size: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter element: ");
		            arr[i] = sc.nextInt();
		        }
		        
		        System.out.print("Array: ");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        
		        Set<Integer> set = new HashSet<>();
		        for (int i = 0; i < arr.length; i++) {
		            set.add(arr[i]);
		        }
		        
		        int maxLength = 0;
		        
		        for (int i = 0; i < arr.length; i++) {
		            int num = arr[i];
		            if (!set.contains(num - 1)) {
		                int length = 1;
		                while (set.contains(num + 1)) {
		                    num++;
		                    length++;
		                }
		               if(maxLength<length)
		               {
		            	   maxLength=length;
		               }
		            }
		        }
		        
		        System.out.println("\nLongest consecutive length: " + maxLength);
		        sc.close();
		
	}

}
