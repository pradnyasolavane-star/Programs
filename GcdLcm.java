package programs_task1;
import java.util.*;
public class GcdLcm {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        int x = a, y = b; 
	        while (b != 0) {
	            int remainder = a % b;
	            a = b;
	            b = remainder;
	        }
	        int gcd = a;
	        
	        int lcm = (x * y) / gcd;
	        
	        System.out.println("GCD of " + x + " and " + y + " is: " + gcd);
	        System.out.println("LCM of " + x + " and " + y + " is: " + lcm);
	        
	        sc.close();
	}

}
