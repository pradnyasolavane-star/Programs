package programs_task1;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter two Numbers to add:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("the Addition of two number is:"+(x+y));
		sc.close();
	}

}
