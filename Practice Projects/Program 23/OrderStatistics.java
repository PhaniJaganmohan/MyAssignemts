package com.jagan.learning;

import java.util.Scanner;

public class OrderStatistics
{
	public static void main(String[] args) {
		Smallest ob = new Smallest(); 
		int[] arr = new int[50];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want : ");
		int k = scan.nextInt();
		System.out.println("Enter the numbers :");
		for(int i=0;i<k;i++) {
			arr[i]=scan.nextInt();
		}
        int  j = 1; 
        System.out.println("smallest element is "+ ob.small(arr, 0, k-1, j)); 
    }
}


class Smallest 
{ 
int small(int arr[], int l, int r, int j) 
    	{ 
             		if (j > 0 && j <= r - l + 1) 
        		{ 
            			int pos = randomPartition(arr, l, r); 
            			if (pos-l == j-1) 
                			return arr[pos]; 
            			if (pos-l > j-1) 
                			return small(arr, l, pos-1, j); 
            			return small(arr, pos+1, r, j-pos+l-1); 
        		} 
        return Integer.MAX_VALUE; 
    } 
    void swap(int arr[], int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    int partition(int arr[], int l, int r) 
    { 
        int x = arr[r], i = l; 
        for (int j = l; j <= r - 1; j++) 
        { 
            if (arr[j] <= x) 
            { 
                swap(arr, i, j); 
                i++; 
            } 
        } 
        swap(arr, i, r); 
        return i; 
    } 
    int randomPartition(int arr[], int l, int r) 
    { 
        int n = r-l+1; 
        int pivot = (int)(Math.random()) * (n-1); 
        swap(arr, l + pivot, r); 
        return partition(arr, l, r); 
    } 
}  
