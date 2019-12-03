package sorting;

import java.util.Scanner;

public class Quick {
	public void sort(int a[], int l, int r) {
		if (l < r) {
			int j = partition(a, l, r);
			sort(a, l, j);
			sort(a, j + 1, r);

		}
	}

	public int partition(int a[], int l, int r) {
		int pivot = a[l];
		int i = l, j = r + 1, temp;
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
		Quick q = new Quick();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		int n = len;
		q.sort(a, 0, n - 1);

		System.out.println("The sorted array is : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		// 18 9 33 4 84 32
		sc.close();

	}

}
