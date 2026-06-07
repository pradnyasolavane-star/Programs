package programs_task1;
import java.util.*;
public class LargestDigit {

	public static void main(String[] args) {
   		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int x=sc.nextInt();
        int max=0;
		while(x>0)
		{
			int r=x%10;
		     
			if(r>max)
			{
				max=r;
			}
			x=x/10;
		}
		System.out.print("the largest digit is"+max);
		sc.close();
	}

}
