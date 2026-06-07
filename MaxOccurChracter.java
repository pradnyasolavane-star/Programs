package programTask2;
import java.util.*;
public class MaxOccurChracter {

	public static void main(String[] args) {
		
				        Scanner sc = new Scanner(System.in);

				        System.out.print("Enter string: ");
				        String str = sc.nextLine();
				        int max=0;
                        char maxchar='\0';
				        for (int i = 0; i < str.length(); i++) 
				        {
				            int count = 0;

				            for (int j = 0; j < str.length(); j++)
				            {

				                if (str.charAt(i) == str.charAt(j))
				                {
				                    count++;
				                }
				            }
                           
				            if (max<count)
				            {
				            	max=count;
				                maxchar=str.charAt(i);
				            }
				        }

				        if (max>0) 
				        {
				            System.out.println("most repeating character is:"+maxchar);
				        }
				        else
				        {
				        	System.out.println("no repeating character :");
				        }
				        
				        sc.close();
			}
		}

	


