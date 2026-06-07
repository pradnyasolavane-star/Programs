package programTask2;

import java.util.Scanner;

public class EleSortedMatrix {

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
	    
	    boolean flag=false;
	    
        System.out.print("enter target:");
        int target=sc.nextInt();
        
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=0;j<c;j++)
	    	{
	    		if(a[i][j]==target)
	    		{
	    			System.out.print("element found at position:["+(i+1)+"] ["+(j+1)+"]");
	    		    flag=true;
	    		    break;
	    		}
	    	}
	    }
       if(flag==false)
       {
    	   System.out.println("element not found");
       }
       sc.close();
	}

}
