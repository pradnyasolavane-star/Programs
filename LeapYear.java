package programs_task1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.print("enter year to check leap year:");
	       int year=sc.nextInt();
	       if(year%4==0 && (year%100 !=0 || year%400 ==0))
	       {
	    	   System.out.println("the year is leap year:"+year);
	       }
	       else
	       {
	    	   System.out.println("the year is not a leap year:"+year);
	       }

    sc.close();
	}

}
