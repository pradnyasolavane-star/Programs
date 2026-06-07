package programTask2;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("enter size of array:");
		        int n = sc.nextInt();
		        int[] arr = new int[n];

		        for (int i = 0; i <n; i++) {
		            System.out.print("enter elemmts of array:");
		            arr[i] = sc.nextInt();
		        }
		        int[] temp = new int[n];
		        System.out.println("enter key to rotate array:");
		        int key = sc.nextInt();
		        int k = 0;

		        for (int j = n- key; j <n; j++) {
		            temp[k] = arr[j];
		            k++;
		        }
		        for (int j = 0; j < n - key; j++) {
		            temp[k] = arr[j];
		            k++;
		        }
		        System.out.println("rotated array:");
		        for (int i = 0; i < temp.length; i++) {
		            System.out.print(temp[i] + "\t");
		        }

		        sc.close();
		    }
		}
