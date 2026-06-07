package programs_task1;

import java.util.Scanner;

public class EvenOddEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	       System.out.print("enter numbers to check even or odd:");
	       int a=sc.nextInt();
	       if(a%2==0)
	       {
	    	   System.out.println("the number is even:"+a);
	       }
	       else
	       {
	    	   System.out.println("the number is odd:"+a);
	       }
	      sc.close();
	}

}
