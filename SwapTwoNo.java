package programs_task1;

import java.util.*;

public class SwapTwoNo {
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter numbers to swap:");
       int a=sc.nextInt();
       int b=sc.nextInt();
        
       a=a+b;
       b=a-b;
       a=a-b;
       
       System.out.println("numbers after swapping are"+a+"and"+b);
       sc.close();
   }
}
