package programs_task1;
import java.util.*;
public class Name {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter your name:");
		String name=sc.next();
		for(int i=1;i<=10;i++)
		{
			System.out.println("My name is :"+name);
		}
		sc.close();
	}

}
