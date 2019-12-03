package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public class SumOfArrays {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			long a[]=new long[n1];
			long b[]=new long[n2];
			int i,j;
			for(i=0;i<n1;i++) {	
				a[i]=sc.nextLong();
			}
			for(i=0;i<n2;i++) {
				b[i]=sc.nextLong();
			}
			i=n1-1;j=n2-1;
			int carry=0;long arr[]=new long[Math.max(n1, n2)+1];
			int k=arr.length-1;
			while(i>=0 ||j>=0) {
				if(i>=0 && j>=0 ) {
					arr[k]=a[i]+b[j]+carry;
					i--;j--;
				}
				else if(j<0 && i>=0) {
					arr[k]=a[i]+carry;
					i--;
				}else if(i<0 && j>=0) {
					arr[k]=b[j]+carry;
					j--;
				}else {
				}
				if(arr[k]>=10) {
					arr[k]-=10;
					carry=1;
				}else {
					carry=0;
				}k--;
				//System.out.println(arr[k]);
			}
			if(carry==1)
				arr[k]=1;
			for(int p=0;p<arr.length;p++){
			    if(arr[p]==0 && p==0){continue;}
			    			System.out.print(arr[p]+" ");
			}
			System.out.println();			
		}
	}
}
/*
			Input:
			2
			3 3
			5 6 3
			8 4 2
			6 4
			2 2 7 5 3 3
			4 3 3 8 
			
			Output:
			1 4 0 5
			2 3 1 8 7 1
 */
//String s="",s1="";
//for(i=0;i<a.length;i++)
//	s+=String.valueOf(a[i]);
//for(i=0;i<b.length;i++)
//	s1+=String.valueOf(b[i]);
//System.out.println(Long.parseLong(s)+Long.parseLong(s1));
