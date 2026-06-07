package programTask2;
import java.util.*;
public class CompressString {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter string: ");
		        String str = sc.nextLine();
		        
		        String compressed = "";
		        int count = 1;
		        
		        for (int i = 0; i < str.length(); i++)
		        {
		            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1))
		            {
		                count++;
		            } 
		            else
		            {
		                compressed += str.charAt(i) + "" + count;
		                count = 1;
		            }
		        }
		        
		        System.out.println("Original: " + str);
		        System.out.println("Compressed: " + compressed);
		        
		        sc.close();
	}

}
