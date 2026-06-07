package programTask2;
import java.util.*;
import java.util.ArrayList;
public class PairWithGivenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter first array elements:");

        for(int i = 0; i < n; i++)
        {

            arr [i] = sc.nextInt();
        }
        
        System.out.print("enter target:");
         int  target=sc.nextInt();
         ArrayList<Integer> al=new ArrayList<>();

          for(int i=0;i<arr.length;i++)
          {
        	  for(int j=i+1;j<arr.length;j++)
        	  {
        	    if((arr[i]+arr[j])==target)
        	     {
        	    	al.add(arr[i]);
      		        al.add(arr[j]);
      		        System.out.print(al);
      		        al.clear();
        	     }
        	 }
        	  
          }
          if(al.isEmpty())
          {
        	  System.out.print("no pair found ");
          }
          sc.close();
	}

}
