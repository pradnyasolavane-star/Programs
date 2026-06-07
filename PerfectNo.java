package programs_task1;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==x)
		{
			System.out.print("the number is perfect:"+x);
		}
		else
		{
			System.out.print("the number is not perfect:"+x);
		}
		sc.close();


	}

}
