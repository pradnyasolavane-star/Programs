package programs_task1;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int sum=0;
        int temp=x;
		while(x>0)
		{
			int r=x%10;
		    sum=(sum*10)+r;
		    x=x/10;
		}
		if(temp==sum)
		{
		   System.out.print("the  number is palindrome :"+sum);
		}
		else
		{
			System.out.println("the number is not palindrome:"+sum);
		}
		sc.close();

	}

}
