package strings;

import java.util.*;

public class RunLengthEncoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str=sc.next();
			Gfg g=new Gfg();
			System.out.println(g.encode(str));
			}
		
		/*
Input
2
aaaabbbccc
abbbcdddd

Output
a4b3c3
a1b3c1d4
		 */
		}
	}


