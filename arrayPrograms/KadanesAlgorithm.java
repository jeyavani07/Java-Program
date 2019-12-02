package arrayPrograms;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			int newa[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(findMax(arr));
	}
		/*
		 * Input
				2
				5
				1 2 3 -2 5
				4
				-1 -2 -3 -4
				Output
				9
				-1
		 */
	}

	private static int findMax(int[] arr) {
		int curr_max=arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++) {
			curr_max=Math.max(arr[i], arr[i]+curr_max);
			max=Math.max(curr_max, max);
		}
		return max;
	}
}


