package programs_task1;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int count=0;
		int grow=0;
        
		while(x>0)
		{
			int r=x%10;
			if(r%2==0)
			{
				count++;
			}
		    if(r%2!=0)
		    {
		    	grow++;
		    }
		    x=x/10;
		}
		
		   System.out.print("the even no count is :"+count+"the odd no count is"+grow);
		
			
		
		sc.close();

	}

}
