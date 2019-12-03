package sorting;

import java.util.Scanner;

public class Merge {
	public void sort(int a[], int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;
			sort(a, l, mid);
			sort(a, mid + 1, h);
			merge(a, l, mid, h);
		}
	}

	public void merge(int a[], int l, int mid, int h) {
		int n1 = mid - l + 1;
		int n2 = h - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		int i = 0, j = 0;
		for (i = 0; i < n1; i++) {
			L[i] = a[i + l];
		}
		for (j = 0; j < n2; j++) {
			R[j] = a[j + mid + 1];
		}
		
		i = 0;
		j = 0;
		int k = l;
		while (i != n1 && j != n2) {
			if (L[i] > R[j]) {
				a[k++] = R[j++];
			} else {
				a[k++] = L[i++];
			}
		}
		while (i != n1) {
			a[k++] = L[i++];
		}
		while (j != n2) {
			a[k++] = R[j++];
		}
	}

	public static void main(String[] args) {
		Merge m = new Merge();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		int n = len;
		m.sort(a, 0, n - 1);

		System.out.println("The sorted array is : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		// 18 9 33 4 84 32
		sc.close();

	}

}
