package programs_task1;
import java.util.*;
public class SimpleInterset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter principal and rate and time:");
		int p=sc.nextInt();
		float r=sc.nextFloat();
		int t=sc.nextInt();
		
		float i=(p*r*t)/100;
		System.out.println("the Simple interest of principal"+p+" , Rate:"+r+" , Time:"+t+", is:"+i);
		sc.close();
	}

}
