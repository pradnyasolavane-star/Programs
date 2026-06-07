package programs_task1;

import java.util.Scanner;

public class SumOfOddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int sum=0;
		while(x>0)
		{
			int r=x%10;
			if(r%2!=0)
			{
				sum=sum+r;
			}
			x=x/10;
			
	    }
		System.out.println("the total sum of odd numbers is :"+sum);
		sc.close();
	}

}
