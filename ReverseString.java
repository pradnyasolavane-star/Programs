package programTask2;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		  String str=sc.next();
                String reverse = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            reverse = reverse + str.charAt(i);
		        }

		        System.out.println("Original: " + str);
		        System.out.println("Reversed: " + reverse);
		        
		        sc.close();
	}

}
