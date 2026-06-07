package programTask2;
import java.util.*;
public class MatrixTranspose {

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
	    System.out.println("the matrix is :");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    int[][] t=new int[r][c];
	    for(int i = 0; i < r; i++) {
	        for(int j = 0; j < c; j++) {
	            t[j][i] = a[i][j]; 
	        }
	    }
	    System.out.println("the Transpose matrix is :");
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		System.out.print(t[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
	}

}
