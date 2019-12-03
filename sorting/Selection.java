package sorting;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		
		len=a.length;int temp=0;
		for(int i=0;i<len-1;i++) {
			int min=i;
			for(int j=i+1;j<len;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}

		System.out.println("The sorted array is : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		// 18 9 33 4 84 32
		sc.close();

	}

}
