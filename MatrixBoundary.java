package programTask2;

import java.util.Scanner;

public class MatrixBoundary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of rows:");
		int r=sc.nextInt();
		System.out.print("enter no of column:");
		int c=sc.nextInt();
	    int[][] a=new int[r][c];
	    
	    System.out.println("enter"+(r*c)+"elements:");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }

	            for(int i=0; i<r; i++)
	            {
	                System.out.print(a[0][i]+" ");
	            }

	            for(int i=1; i<c; i++) 
	            {
	                System.out.print(a[i][2]+" ");
	            }

	            for(int i=1; i>=0; i--)
	            {
	                System.out.print(a[2][i]+" ");
	            }

	            for(int i=1; i>0; i--)
	            {
	                System.out.print(a[i][0]+" ");
	            }
	     sc.close();  
	}

}
