package arrayPrograms;

import java.util.Scanner;

public class NextLargerElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {	
				arr[i]=sc.nextInt();
			}
			int i,j;
			for(i=0;i<arr.length;i++) {
				for(j=i+1;j<arr.length;j++) {
					if(arr[j]>arr[i]) {
						System.out.print(arr[j]+" ");
						break;
					}
				}if(j==arr.length)
				System.out.print("-1"+" ");
			}
			System.out.println();
		}
		sc.close();
		
				/*
				Input
				2
				4
				1 3 2 4
				4
				4 3 2 1
				Output
				3 4 4 -1
				-1 -1 -1 -1
				 */
	}

}
