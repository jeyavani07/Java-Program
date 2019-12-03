package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

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
			Arrays.sort(arr);
			int i=0;
			//System.out.println(Arrays.toString(arr));
			for(i=arr.length-1;i>0;i--) {
				if(!((arr[i]==arr[i-1]))) {
					System.out.println(arr[i-1]);
					break;
				}
			}
			if(i==0) {
				System.out.println("-1");
			}
		}
		
	}
}
/*
 * Input:
3
10 10 10

Its Correct output is:
-1

Input:
2
5
2 4 5 6 7
6
7 8 2 1 4 3
Output:
6
7
 */

