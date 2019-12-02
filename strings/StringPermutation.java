package strings;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			permute(str, 0, str.length() - 1);
		}

	}

	private static void permute(String str, int l, int r) {
		if (l == r) {
				System.out.println(str);
		}else {
			for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			permute(str,l+1,r);
			str=swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int l, int i) {
		char ch[]=str.toCharArray();
		char temp=ch[l];
		ch[l]=ch[i];
		ch[i]=temp;
		return String.valueOf(ch);
	}

}
