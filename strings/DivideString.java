package strings;

import java.util.Scanner;

public class DivideString {
	static public void split(String str, int n) {
		int  j = 0;
		while (j < str.length() && n <= str.length()) {
			System.out.println(str.substring(j, n));
			j = j + 3;
			n = n + 3;
		}
		System.out.println(str.substring(j));

		// System.out.println(s);
		// System.out.println(str.substring(n,n+3));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		split(str, n);
		sc.close();
	}

}
