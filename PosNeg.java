package programs_task1;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.print("enter numbers to check positive or negative:");
	       int a=sc.nextInt();
	       if(a>0)
	       {
	    	   System.out.println("the number is positive:"+a);
	       }
	       else if(a<0)
	       {
	    	   System.out.println("the number is negative:"+a);
	       }
	       else
	       {
	    	   System.out.println("the number is zero"+a);
	       }
     sc.close();
	}

}
