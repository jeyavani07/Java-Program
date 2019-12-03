package string;

import java.util.Scanner;

public class RemoveDuplicates {
static void removeDup(String str) {
	char st[]=str.toCharArray();
	for(int i=0;i<str.length()-1;i++) {
		for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					str=str.replace(st[i], ' ');
		}
				str=str.replaceAll(" ", "");
	}
	}
	System.out.println("replaced  : "+str);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.nextLine();
		removeDup(st);
		sc.close();
	}

}
