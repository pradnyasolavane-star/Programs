package programs_task1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int sum=0;
		while(x>0)
		{
			int r=x%10;
		    sum=sum+r;
		    x=x/10;
		}
		System.out.print("the sum of digit  is :"+sum);
		sc.close();

	}

}
