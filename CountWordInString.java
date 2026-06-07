package programTask2;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args)
	{	
		        Scanner sc=new Scanner(System.in);
		       System.out.println("enter string:");
		        String str=sc.nextLine();

		        int count = 0;
		        for (int i = 0; i < str.length(); i++)
		        {
		            if (str.charAt(i) == ' ')
		            {
		                count++;
		            }
		        }

		        System.out.println("String: " + str);
		        System.out.println("Total words: " + (count + 1));
		        sc.close();
			}

}
