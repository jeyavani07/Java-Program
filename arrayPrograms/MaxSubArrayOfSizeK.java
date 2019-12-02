package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArrayOfSizeK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int size = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[size];
			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			int maxa[] = new int[size - k + 1];
//			for (int i = 0; i < maxa.length ; i++) {
//				 maxa[i] = a[i];
//				for (int j = i; j < i + k; j++) {
//				//	if ((j + 1) < (i + k) )
//						if (a[j] > maxa[i])
//							maxa[i] = a[j];
//				}
//				
//			}
			for(int i=0;i<maxa.length;i++) {
				maxa[i]=find(a,i,i+k);
				
			}

			for (int j = 0; j < maxa.length; j++) {
				System.out.print(maxa[j] + " ");
			}
		}

		/*
		 * Input: 2
		 *  9 3 
		 *  1 2 3 1 4 5 2 3 6
		 *   10 4 
		 *   8 5 10 7 9 4 15 12 90 13
		 * 
		 * Output: 3 3 4 5 5 5 6 
		 * 10 10 10 15 15 90 90
		 */
	}

	private static int find(int[] a,int i,int k) {
		int arr[]=new int[k];
		int p=0;
		for(int j=i;j<k;j++) {
			arr[p++]=a[j];
		}
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

}
