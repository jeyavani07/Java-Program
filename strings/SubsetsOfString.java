package strings;

import java.util.Scanner;

public class SubsetsOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int j=str.length();
		System.out.println("The subsets of the string are : ");
		for(int i=0;i<str.length()-1;i++) {
			for(j=str.length();j>=0 && j>=i;j--) {
				System.out.println(str.substring(i,j));
			}
			//j=j-1;
		}

	}

}
