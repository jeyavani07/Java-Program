package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctDigitArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			int x=0,digsize=0;
			for(int i=0;i<size;i++) {	
				arr[i]=sc.nextInt();
				x=arr[i];
				while(x!=0) {
					digsize++;
					x/=10;
				}
			}
			int digit[][]=new int[digsize][2];
			for(int i=0;i<digit.length;i++) {
			Arrays.fill(digit[i], 0);
			}
//			for(int i=0;i<digit.length;i++) {
//				for(int j=0;j<digit[i].length;j++) {
//					System.out.print(digit[i][j]+ " ");
//				}
//			}
			int k=0;
			for(int i=0;i<arr.length;i++) {
				x=arr[i];
				while(x!=0) {
					if(digit[k][1]!=1) {
					digit[k][0]=x%10;
					digit[k][1]=1;
					k++;
					}
					x/=10;
				}
			}
			for(int i=0;i<digsize;i++) {
				System.out.print(digit[i][0]+" ");
			}
		}

		
		
		sc.close();
		/*
		Input:
		2
		3
		131 11 48
		4
		111 222 333 446
		
		Output:
		1 3 4 8
		1 2 3 4 6
		 */
	}

}
