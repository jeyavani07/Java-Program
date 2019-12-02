package sorting;

import java.util.Scanner;

public class BubbleSort {

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
		int len = a.length, temp;
		// Bubble sorting
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
