package javaprograms;

import java.util.Scanner;

public class SumPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The number is :" + findPal(num));
		sc.close();
	}

	static int count = 0;

	private static int findPal(int num) {
		int rev=findRev(num);
		System.out.println("REv"+rev);
		if(count++  ==5)
			return 0;
		if(num == rev) {
			System.out.println("Equal");
			return rev;
		}else {
			findPal(num+rev);
		}
		return rev;
	}

	private static int findRev(int num) {
		int temp=num;
		int revpal=0;
		while(temp!=0) {
			revpal=revpal*10+(temp%10);
			temp/=10;
		}
		return revpal;
	}
}
