package programs_task1;

import java.util.Scanner;

public class SumOfnatural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int ans=0;
		for(int i=0;i<=x;i++)
		{
			 ans=ans+i;
			
		}
		 System.out.println("the of first N natural number is :"+ans);
      sc.close();
	}

}
