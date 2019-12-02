package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static public boolean find(char ch[],char ch1[]) {
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch1, ch)==true) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		
		boolean b=find(ch1,ch2);
		if(b==true) {
			System.out.println("anagram");
		}else
		{
			System.out.println("not an anagram");
		}
		
		
		
		if (str1.length() != str2.length()) {
			System.out.println("Length is not equal");System.exit(0);
		} else {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str1.length(); j++) {
					if (ch1[i] == ch2[j] && ch1[i] != '0' && ch2[j] != '0') {
						ch1[i] = '0';
						ch2[j] = '0';
					}
				}
			}
			if (String.valueOf(ch1).equals(String.valueOf(ch2))) {
				System.out.println("It is an anagram");
			}
			sc.close();
		}
	}

}
