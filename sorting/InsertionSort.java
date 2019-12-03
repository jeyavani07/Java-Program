package sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		int key,pos;
		for(int i=1;i<len;i++) {
			key=a[i];
			pos=i;
			while(pos>0 && a[pos-1]>key) {
				a[pos]=a[pos-1];
				pos--;
			}
			a[pos]=key;
		}
		
		
		for (int i : a) {
			System.out.println(i + " ");
		}
		sc.close();
		// 18 9 33 4 84 32
	}
}
