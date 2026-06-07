package programTask2;

import java.util.Scanner;

public class MatrixMult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of rows:");
		int r=sc.nextInt();
		System.out.print("enter no of column:");
		int c=sc.nextInt();
	    int[][] a=new int[r][c];
	    int[][] b=new int[r][c];
	    System.out.println("enter"+(r*c)+"elements:");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("enter"+(r*c)+"elements:");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		b[i][j]=sc.nextInt();
	    	}
	    }
	    int[][] result=new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		result[i][j]=result[i][j]+(a[i][j]*b[i][j]);
	    	}
	    }
	    System.out.println("the  matrix A is :");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("\nthe  matrix B is :");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(b[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("\nthe matrix After multiplication (ans) is :");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(result[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
	}

}
