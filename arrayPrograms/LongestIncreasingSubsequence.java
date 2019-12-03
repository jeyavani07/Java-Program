package arrayPrograms;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

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
			findLongest(arr);
		}
	}

	private static void findLongest(int[] arr) {
		int len[]=new int[arr.length];
		int n=arr.length;
		int subseq[]=new int[arr.length];
		int count=0;
		int newarr[]=new int[count];
		for(int i=0;i<n;i++) {
			len[i]=1;
		}
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
				len[i]=Math.max(len[i], len[j]+1);
				subseq[i]=j;
				}
			}
		}
		int max=len[0],pos=0;
		for(i=0;i<n;i++) {
			if(max<len[i]) {
				max=len[i];
				pos=i;
				count++;
			}
		}
		int k=0;
		for(i=pos;i>=0;) {
			if(newarr[k]!=0) {
			newarr[k]=subseq[i];
			i=newarr[k];
			k++;}
			else {
				break;
			}
		}
		for(i=count-1;i>=0;i--) {
			System.out.print(arr[newarr[i]]+" ");
		}
	}

}
/*
 * Input:
2
16
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15
6
5 8 3 7 9 1

Output:
6
3
*/
