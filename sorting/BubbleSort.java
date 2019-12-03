package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		// 18 9 33 4 84 32
		
		
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i + " ");
		}
		sc.close();
	}

}
