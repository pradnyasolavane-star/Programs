package programTaskD3;
import java.util.*;
import java.util.HashSet;
public class RemoveDuplicateHashset {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       HashSet<Integer> hs=new HashSet<>();
       System.out.println("enter number of elements u want to insert:");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   System.out.println("enter element");
    	   int ele=sc.nextInt();
    	   hs.add(ele);
       }
       System.out.println(hs);
       sc.close();
	}

}
