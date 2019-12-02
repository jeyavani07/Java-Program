package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlternately {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
//			for(int i=0;i<size;) {
//				int key=arr[arr.length-1];
//				for(int j=arr.length-1;j>i;j--) {
//					arr[j]=arr[j-1];
//				}
//			
//				arr[i]=key;
//				i=i+2;
//				//System.out.println(Arrays.toString(arr));
//			}
			int newarr[]=new int[size];
			int k=0;
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				newarr[k++]=arr[j];
				newarr[k++]=arr[i];
			}
			if(newarr.length%2 !=0) {
				newarr[k]=arr[arr.length/2];
			}
			//System.out.println(Arrays.toString(newarr));
			for(int p:newarr) {
			System.out.print(p+" ");
		}
			System.out.println();
		}
		
		
/*
 * Input:
2
6
1 2 3 4 5 6
11 
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60
 */
	}

}
