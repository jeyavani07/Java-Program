package handson;

import java.util.Scanner;

public class LongestCommonSubstring {
	public static String substring(String s, String s1) {
		int len = s1.length();
		String str = "", prev = "";

		int i = 0, j = 0;
		for (int ma = 0; ma < s.length(); ma++) {
			i = ma;
			j = 0;
			while (true) {
				if (s.charAt(i++) == s1.charAt(j++)) {
					str += s.charAt(i);
				} else {
					break;
				}
			}
			
			ma++;
			if (prev.length() < str.length()) {
				prev = str;
			}
		}
		return prev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of iterations: ");
		int iteration = sc.nextInt();
		int n[][] = new int[iteration][2];
		String str[][] = new String[iteration][2];
		for (int in = 0; in < iteration; in++) {
			System.out.println("Enter the sizes of the strings");
			for (int i = 0; i < iteration; i++) {
				for (int j = 0; j <= 1; j++) {
					n[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the two strings: ");
			for (int i = 0; i < iteration; i++) {
				for (int j = 0; j <= 1; j++) {
					str[i][j] = sc.next();
				}
			}
		}

		String sub[] = new String[iteration];

		for (int in = 0; in < iteration; in++) {
			String s1 = str[in][0];
			String s2 = str[in][1];
			// ABCDGH
			// ACDGHR
			sub[in] = substring(s1, s2);
			System.out.println(sub[in]);
		}

		sc.close();
	}

}
