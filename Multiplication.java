package programs_task1;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			 int ans=x*i;
			 System.out.println(x+"*"+i+"="+ans);
		}
      sc.close();
	}

}
