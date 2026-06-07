package programTask2;

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		  String str=sc.next();
		  int vowel=0;
		  int con=0;
		  for(int i=0;i<str.length();i++)
		  {
			  char ch=str.charAt(i);
			  if(ch=='a'||ch=='e' ||ch=='o' ||ch=='i' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' |ch=='O'|| ch=='U')
			  {
				  vowel++;
			  }
			  else
			  {
				  con++;
			  }
		  }
		  System.out.println("the count of vowel in string is:"+vowel+"\tand consonants are:"+con);
          sc.close();
	}

}
