package Arrays_Example;

import java.util.Scanner;

public class Array_mult
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row & col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] arr1 = new int[row][col];
		int [][] arr2 = new int[row][col];
		
//		System.out.println("Enter the value of row1 & col1");
//		int row1 = sc.nextInt();
//		int col1 = sc.nextInt();
//		int [][] arr2 = new int[row1][col1];
		
		
		int result[][] = new int[row][col];
		
		System.out.println("Element of array  1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
			System.out.println( );
		}
		
		System.out.println("Element of array  2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
			System.out.println( );
		}
		
		System.out.println("User inputs of array 1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println( );
		}
		
		System.out.println("User inputs of array 2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println( );
		}
		
		
		System.out.println("Multiplication of array1 and array 2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j] =0;
				for(int k=0;k<row;k++)
				{
					
					result[i][j]+= arr1[i][k]*arr2[k][j];
				}
				
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}


		

	}
}
