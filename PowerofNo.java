package programs_task1;
import java.util.*;
public class PowerofNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter digit and its power:");
		int digit=sc.nextInt();
		int power=sc.nextInt();
		int ans=1;
		for(int i=1;i<=power;i++)
		{
			 ans=ans*digit;
		}
       System.out.println("the power of number is"+ans);
	}

}
