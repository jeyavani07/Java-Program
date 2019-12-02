package strings;

import java.util.Scanner;

public class SpecialArrayReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str=sc.next();
			System.out.println(reverse(str));
		}
	}

	private static String reverse(String str) {
		char ch[]=str.toCharArray();
		for(int i=0,j=ch.length-1;i<j;) {
			if((Character.isLetterOrDigit(ch[i]))) {
				if((Character.isLetterOrDigit(ch[j]))) {
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
					i++;
					j--;
				}else {
					j--;
				}
			}else {
				i++;
			}
		}
		return String.valueOf(ch);
	}
}


		
		
		
		/*
			Input
			3
			A&B
			abc%sld*
			dakA&*hA@#N
			
			Output
			B&A
			dls%cba*
			NAhA&*ka@#d
		 */
