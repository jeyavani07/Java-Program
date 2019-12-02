package strings;

import java.util.Scanner;

public class RemoveCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		String temp=null;
		if(s1.length()<s2.length()) {
			temp=s1;
			s1=s2;
			s2=temp;
		}
//incomplete
	}

}
