package strings;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str=sc.next();
			printPattern(str.substring(str.length()/2)+str.substring(0,str.length()/2));
			}
		}

	private static void printPattern(String s) {
		//System.out.println(string);
for(int i=0;i<s.length();i++) {		
	//int k=0;
	for(int j=0;j<s.length()*2-i*2-2;j++) {
			System.out.print(" ");
	}
	System.out.print(s.substring(0,i+1));
	System.out.println();
}
	}
	}
/*
 * Input: PROGRAM                            Input: RAT
Output:                                   Output:
            G                                       A
          GR                                      AT  
        GRA                                     ATR
      GRAM
    GRAMP
  GRAMPR
GRAMPRO

 */

