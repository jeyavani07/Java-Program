package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryArraySorting {
	public static void sort(int a[]) {
		Arrays.sort(a);
		store(a);
	}
	static int arr[]=new int[10];
	public static void store(int n[]) {
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			int x=sc.nextInt();
			for(int j=0;j<x;j++) {
				arr[i]=sc.nextInt();
			}
			sort(arr);
		}
				
	}

}

/*
2
5
1 0 1 1 0
10
1 0 1 1 1 1 1 0 0 0

*/
