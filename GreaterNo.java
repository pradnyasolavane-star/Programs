package programs_task1;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.print("enter 3 numbers:");
	       int x=sc.nextInt();
	       int y=sc.nextInt();
	       int z=sc.nextInt();
	       if(x>y && x>z)
	       {
	    	   System.out.println("the x is greater than y and z:"+x);
	       }
	       else if(y>x && y>z)
	       {
	    	   System.out.println("the y is greater than x and z:"+y);
	       }
	       else
	       {
	    	   System.out.println("the z is greater than x and y:"+z);
	       }

    sc.close();
	}

}
