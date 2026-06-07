package programs_task1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter length of series:");
		int n=sc.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+"\n");
			c=a+b;
			a=b;
			b=c;
		}
   sc.close();
	}

}
