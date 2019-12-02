package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int len1=sc.nextInt();
			int len2=sc.nextInt();
			int arr1[]=new int[len1];
			int arr2[]=new int[len2];
			for(int i=0;i<len1;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<len2;i++) {
				arr2[i]=sc.nextInt();
			}
			int newarr[]=new int[len1+len2];
			int k=0;int i=len1,j=len2;
			while(i-->0) {
				newarr[k++]=arr1[i];
			}while(j-->0) {
				newarr[k++]=arr2[j];
			}
			int count=0;
			for(int p=0;p<newarr.length-1;p++) {
				for(int l=p+1;l<newarr.length;l++) {
					if(newarr[p]==newarr[l] && newarr[p]!=0) {
						newarr[l]=0;
						count++;
					}
				}
			}
			//System.out.println(Arrays.toString(newarr));
			System.out.println(newarr.length-count);
			
			
			
		}
		
		/*
		 * Input:
		 
			2
			5 3
			1 2 3 4 5
			1 2 3
			6 2
			85 25 1 32 54 6
			85 2

			Output:
			5
			7
		*/
	}

}
