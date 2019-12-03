package handson;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of string array");
		int n = sc.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the string array");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		int len = 0, pos = 0;
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i].length() < s[i + 1].length()) {
				len = s[i ].length();
				pos = i;
			}
		}
		String newst = "",prev="";
		int size = 0;
		for (int j = 0; j < s.length && j != pos; j++) {
			newst="";
			for (int i = 0; i < len; i++) {
				if (s[pos].charAt(i) == s[j].charAt(i)) {
						newst += s[j].charAt(i);
				} else {
					break;
				}
			}
				if(prev.length()<newst.length())
				prev=newst;
		}
		System.out.println(prev);

		sc.close();
	}

}
