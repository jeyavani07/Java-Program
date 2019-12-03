package handson;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumToys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of iterations:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the no of items ");
			int items = sc.nextInt();
			int[] a = new int[items];
			System.out.println("Enter the sum amount");
			sum = sc.nextInt();
			for (int j = 0; j < items; j++) {
				a[j] = sc.nextInt();
			}
			int temp = sum;
			int count = 0;
			Arrays.sort(a);
			int p = 0, q = 0;
			while (temp > a[q++]) {
				temp -= a[p++];
				count++;
			}
			System.out.println(count);
		}

	}

}
