package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		int min,temp;
		for(int i=0;i<len-1;i++) {
			min=i;
			for(int j=i+1;j<len;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
		
		for (int i : a) {
			System.out.println(i + " ");
		}
		sc.close();
		// 18 9 33 4 84 32
	}

}
