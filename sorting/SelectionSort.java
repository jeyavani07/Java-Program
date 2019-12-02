/**
 * Selection sort is done by placing the smallest element 
 * first in the postion and doing it repeatedly
 */

package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int len = a.length, min, temp;
		for (int i = 0; i < len-1; i++) {
			min = i;
			for (int j = i; j < len; j++) {
				if (a[min] > a[j]) {
						min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
	
		}
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
		
	}

}
