package programs_task1;
import java.util.*;
public class CharacterTypeChecker {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a character: ");
		        char c = sc.next().charAt(0);
		        
		        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) 
		        {
		            System.out.println(c + " is an Alphabet");
		        } 
		        else if (c >= '0' && c <= '9')
		        {
		            System.out.println(c + " is a Digit");
		        } 
		        else
		        {
		            System.out.println(c + " is a Special Character");
		        }
		        
		        sc.close();
		    }
		
}
