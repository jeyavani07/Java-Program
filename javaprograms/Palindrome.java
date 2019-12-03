package javaprograms;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		String s=String.valueOf(x);
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0;
		while(i <n) {
			System.out.println(isPalindrome(arr[i]));
			i++;
		}
		sc.close();
	}

}
