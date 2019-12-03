package sorting;

import java.util.Scanner;

public class QuickSort {
	void sort(int a[], int l, int h) {
		if (l < h) {
			int j = partition(a, l, h);
			sort(a, l, j);
			sort(a, j + 1, h);
		}
	}

	int partition(int a[], int l, int h) {
		int i = l, j = h + 1, temp;
		int pivot = a[l];
		while (i < j) {
			do {
				i++;
			} while (a[i] <= pivot);
			do {
				j--;
			} while (a[j] > pivot);
			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		temp = a[l];
		a[l] = a[j];
		a[j] = temp;

		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}

		QuickSort q = new QuickSort();
		q.sort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i + " ");
		}
		sc.close();
		// 18 9 33 4 84 32
	}
}
