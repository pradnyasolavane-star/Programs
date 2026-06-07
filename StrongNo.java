package programs_task1;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		int sum=0;
		int temp=x;
        
		while(x>0)
		{
			int r=x%10;
			int fact=1;
		    for(int i=1;i<=r;i++)
		    {
		    	fact=fact*i;
		    }
		    sum=sum+fact;
		    x=x/10;
		}
		if(temp==sum)
		{
		   System.out.print("the  number is strong:"+sum);
		}
		else
		{
			System.out.println("the number is not strong:"+sum);
		}
		sc.close();
	}

}
