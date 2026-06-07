package programTask2;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
		  String str=sc.nextLine();
		  String result="";
		  for(int i=0;i<str.length();i++)
		  {
			 if(str.charAt(i)==' ')
			 {
		        str.trim();
			 }
			 else {
		        result=result+str.charAt(i);
			 }
		  }
		  System.out.println("string after removing space:\t"+result);
           sc.close();
	}

}
