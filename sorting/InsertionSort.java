package sorting;

import java.util.Scanner;

public class InsertionSort {

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
		int len = a.length, key, pos;
		for (int i = 1; i < len; i++) {
			key = a[i];
			pos = i;
			while ( pos>0 && a[pos - 1] > key) {
				a[pos] = a[pos - 1];
				pos--;
			}
			a[pos] = key;
		}

		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();

	}

}
