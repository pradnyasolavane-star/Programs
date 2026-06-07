package programTask2;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

    	 Scanner sc=new Scanner(System.in);
	     System.out.print("enter row:");
	     int rows=sc.nextInt();

        for (int i = 0; i < rows; i++) {

            
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }

            
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
            sc.close();
        }
    }
}

/**C(i, j+1)         i! / ((j+1)! * (i-j-1)!)
   ----------  =   ----------------------------
     C(i, j)          i! / (j! * (i-j)!)
     
                =   (i-j) / (j+1)**/
