package strings;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str=sc.next();
			int count=sc.nextInt();
			System.out.println(str.length());
			System.out.println(isPangram(str,count)?"1":"0");
			
		}
	}

	private static boolean isPangram(String str, int count) {
		if(str.length()>=26) {
		HashSet<Character> ch = new HashSet<Character>();
			for(int i=0;i<str.length();i++) {
				if(!ch.contains(str.charAt(i)))
					ch.add(str.charAt(i));
			}
			int n=ch.size();
			if(n+count>=26) {
				return true;
			}else {
		return false;
			}
		}else {
			return false;
		}
	}

}
/*
Input

2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24


Output
0
1
*/