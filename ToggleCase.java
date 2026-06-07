package programTask2;
import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
		String str=sc.nextLine();
		String toggle="";
		for(int i=0;i<str.length();i++)
		{
		   char ch=str.charAt(i);	
		   if(Character.isLowerCase(ch))
		   {
			   toggle=toggle+Character.toUpperCase(ch);
		   }
		   else
		   {
			   
				   toggle=toggle+Character.toLowerCase(ch);   
		   }
		}
		System.out.print("\noriginal string:"+str);
		System.out.print("\ntoggled string :"+toggle);
		sc.close();
	}

}
