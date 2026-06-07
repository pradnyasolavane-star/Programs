package programs_task1;
import java.util.*;

class Atm
{
	private int bal;
	Atm(int n)
	{
		bal=n;
	}
	public void deposit(int amount)
	{
	    bal=bal+amount;
	}
	public void withdraw(int amount)
	{
		 bal=bal-amount;
	}
	public void checkbal(int n)
	{
		System.out.println("the total amount available is:"+bal);
	}
}


public class AtmMenu {
	

public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter balance:");
      int bal=sc.nextInt();
      Atm a=new Atm(bal);
      while(true)
      {
    	   System.out.print("1.Deposit\t 2.withdraw \t 3.check balance\t4.Exit\n");
    	   System.out.print("enter your choice:");
    	   int ch=sc.nextInt();
    	   sc.nextLine();
    	   switch(ch)
    	   {
    	   case 1:
    		        System.out.print("enter amount to deposit:");
    		        int amount=sc.nextInt();
    		        a.deposit(amount);
    		        break;
    		case 2:
    		      System.out.print("enter amount to withdraw:");
    		       int amount2 = sc.nextInt();
    		        a.withdraw(amount2); 
    		        break;

    		case 3:
    		       a.checkbal(0);       
    		        break;
    		case 4:
    			     System.exit(0);
    			     
    	   }
      }
	}
}
