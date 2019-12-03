package strings;

import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String str=sc.nextLine();
			System.out.println(removeSpaces(str));
			}
		}

	private static String removeSpaces(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				s+=str.charAt(i);
			}
		}
		return s;
	}
}
/*
 * Input:
2
geeks  for geeks
    g f g

Output:
geeksforgeeks
gfg
 */

