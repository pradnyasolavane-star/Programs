package programs_task1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter two numbers for operation:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(true)
		{
		  System.out.println("1.Addition\t 2.substraction\t 3.multipilcation\t 4.division\t 5.exit\n");
		  System.out.print("enter your choice:");
		  int ch=sc.nextInt();
		  sc.nextLine();
		  switch(ch)
		   {
		      case 1:
		    	       int ans=x+y;
		    	       System.out.println("the addition of numbers is :"+ans);
		    	       break;
		      case 2:
		    	       int answer=x-y;
		    	       System.out.println("the substraction of numbers is :"+answer);
		    	       break;
		      case 3:
		    	  
	    	       System.out.println("the multiplication of numbers is :"+(x*y));
	    	       break;
		      case 4:
		    
	    	       System.out.println("the division of numbers is :"+(x/y));
	    	       break;
		      case 5:
		    	       System.exit(0);
		   }
		}
			
	}
}
