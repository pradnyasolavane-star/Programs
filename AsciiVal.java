package programs_task1;
import java.util.*;
public class AsciiVal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a character or string: ");
		                
		                System.out.print("Enter a character: ");
		                char ch = sc.next().charAt(0);
		                
		                int ascii = (int) ch;
		                System.out.println("ASCII value of " + ch + " = " + ascii);
		                
		                sc.close();
		 
	}

}
