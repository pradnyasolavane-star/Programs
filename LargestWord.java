package programTask2;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args)
	{
		     Scanner sc = new Scanner(System.in);        
              System.out.print("Enter string: ");
              String str = sc.nextLine();
                
                String[] word= str.split(" ");
                
                String longestWord = "";
                
                for (int i = 0; i < word.length; i++) {
                    if (word[i].length() > longestWord.length()) {
                        longestWord = word[i];
                    }
                }
                
                System.out.println("String: " + str);
                System.out.println("Longest word: " + longestWord);
                System.out.println("Length: " + longestWord.length());
                
                sc.close();
            }
}
