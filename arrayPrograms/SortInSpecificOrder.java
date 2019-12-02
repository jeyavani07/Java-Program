package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortInSpecificOrder {

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
			int i = 0,j=0;
			for (i = size - 1; i >= 0; i--) {
				if (arr[i] % 2 == 1) {
					newa[j++] = arr[i];
				}
			}
			for (i=0; i < size; i++) {
				if(arr[i]%2==0)
				newa[j++]=arr[i];
			}
			for(int k:newa) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
         /*
2
7
1 2 3 5 4 7 10
7
0 4 5 3 7 2 1
          */
		sc.close();
	}

}
