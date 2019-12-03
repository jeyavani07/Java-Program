package arrayPrograms;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = { 1, 4,6,2,3,5};
		int len = arr.length;
		int max = 0, min = 0;
		int temp = 0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*int newa[] = new int[arr.length];
		int k = 0;
		for (int i = 0, j = arr.length - 1; k < len; i++, j--) {
			newa[k] = arr[j];
			k++;
			if (k != newa.length)
				newa[k] = arr[i];
			k++;
		}*/
		
		for(int i=0;i<arr.length;i+=2) {
			int key=arr[len-1];
			int j=len-1;
			while(j>i) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[i]=key;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(newa));

	}

}
