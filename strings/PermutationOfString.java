package strings;

import java.util.Scanner;

public class PermutationOfString {
	public static int count = 0;

	public static void permute(String str, int start, int end) {
		if (start == end - 1) {
			count++;
			System.out.println(count + ". " + str);
		}
		for (int i = start; i < end; i++) {
			str = swap(str, start, i);
			permute(str, start + 1, end);
			str = swap(str, start, i);
		}
	}

	public static String swap(String s, int i, int j) {
		char ch[] = s.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		int len = str.length();
		permute(str, 0, len);
	}
}
