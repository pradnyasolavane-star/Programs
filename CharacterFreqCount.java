package programTask2;

import java.util.Scanner;

public class CharacterFreqCount {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter string: ");
		        String str = sc.nextLine();
		        
		        String freq = "";
		        
		        for (int i = 0; i < str.length(); i++) {
		            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))
		            {   
		                continue;
		            }
		            else
		            {
		                int count = 1;
		                for (int j = i + 1; j < str.length(); j++)
		                {
		                    if (str.charAt(i) == str.charAt(j))
		                    {
		                        count++;
		                    }
		                }
		                freq += str.charAt(i) + "" + count;
		            }
		        }
		        
		        System.out.println("Original: " + str);
		        System.out.println("Frequency count string: " + freq);
		        
		        sc.close();
		
	}

}
