package programTask2;

import java.util.Scanner;

public class Anagram {
	    public static void main(String[] args) {
         
	    	Scanner sc=new Scanner(System.in);
			System.out.print("enter string:");
			 String str1=sc.next();
   
			 System.out.print("enter string:");
	     	 String str2=sc.next();
			   
	        int count=0;
	        int grow=0;
	        String arr="";
	        String arr1="";
	        for (int i = 0; i < str1.length(); i++) 
	        {
	        	 arr= arr + str1.charAt(i);
	        	 count++;
	        }

	        for (int i = 0; i < str2.length(); i++) 
	        {
	        	arr1= arr1 + str1.charAt(i);
	        	 grow++;
	        }
	        
	        if (count==grow && (str1.length()==str2.length()))
	        {
	            System.out.println("Anagram");
	        }
	        else
	        {
	            System.out.println("Not Anagram");
	        }
	      sc.close();  
	    }
}
