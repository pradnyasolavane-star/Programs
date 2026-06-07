package programTask2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
		  String str=sc.next();
		   String reverse="";
		  for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
         if(str.equals(reverse))
         {
        	 System.out.println("string is palindrome");
         }
         else
         {
        	 System.out.println("string is not palindrome");
         }
         sc.close();
	}

}
