package programs_task1;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int count=0;

        
		while(x>0)
		{
			int r=x%10;
			if(r>=0)
			{
			 count++;
			}
		    x=x/10;
		}
		
		   System.out.print("the count of digit is :"+count);
		
     sc.close();
	}

}
