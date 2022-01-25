package com.jagan.learning;
import java.util.Scanner;
public class ArrayRotation 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements you want :");
		int k = scan.nextInt();
		int[] arr = new int[50];
		System.out.println("Enter the numbers :");
		for(int i=0;i<k;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the position at where you want to rotate :");
		int n = scan.nextInt();
		System.out.println("original array:");
		
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=0;i<n;i++)
		{
			int j,last;
			last=arr[k-1];
			
			for(j=k;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0]=last;
		}
		System.out.println( );
		
		System.out.println("array after rotation");
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]);
		}
	}
}
