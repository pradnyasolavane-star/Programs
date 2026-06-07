package programTask2;
import java.util.*;
public class SortCharInArray {

	public static void main(String[] args)
	{
    		 Scanner sc=new Scanner(System.in);
	         System.out.println("enter string:");
	          String str=sc.nextLine();

		        char[] ch = str.toCharArray();

		       
		        Arrays.sort(ch);

		        String sorted = new String(ch);

		        System.out.println("Original: " + str);
		        System.out.println("Sorted:   " + sorted);
	     sc.close();
	}

}
