package sorting;

import java.util.*;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str=sc.next();
			System.out.println(findLongestPalindrome(str));
			System.out.println(findLongestPalindromeBack(str));
		}
		
		/*
		 * 			Input:
					1
					aaaabbaa
					
					Output:
					aabbaa
		 */
	}

	private static String findLongestPalindromeBack(String str) {
		int n=str.length();
		boolean table[][]=new boolean[n][n];
		int j,k,start = 0,maxLength=1,i;
		for(i=n-1;i>=0;i--) {
			table[i][i]=true;
			maxLength=1;
		}
		for(i=n-2;i>=0;i--) {
			if(str.charAt(i)==str.charAt(i+1)) {
				table[i][i+1]=true;
				start=i;
				maxLength=2;
			}		
		}
		for(k=3;k<n;k++) {
			int count=0;
			for(i=n-k;i>=0;i--) {
				j=i+k-1;
				if(table[i+1][j-1]==true && str.charAt(i)==str.charAt(j)) {
					//System.out.println(count++);
					table[i][j]=true;
					if(k>maxLength) {
						start=i;
						maxLength=k;
					}
				}
			}
		}
		return str.substring(start,maxLength+start);
	}

	private static String findLongestPalindrome(String str) {
		int n=str.length();
		boolean table[][]=new boolean[n][n];
		int j,k,start = 0,maxLength=1,i;
		for(i=0;i<n;i++) {
			table[i][i]=true;
		}
		for(i=0;i<n-1;i++) {
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				start=i;
				maxLength=2;
			}
		}
		
		for(k=3;k<n;k++) {
			for(i=0;i<n-k+1;i++) {
				j=i+k-1;
				if(table[i+1][j-1]==true && str.charAt(i)==str.charAt(j)) {
					table[i][j]=true;
					if(k>maxLength) {
						start=i;
						maxLength=k;
					}
				}
				
			}
		}
		return str.substring(start,maxLength+start);
	}

}
