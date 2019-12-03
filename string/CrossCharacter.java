package string;

import java.util.Scanner;

public class CrossCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-- >0) {
		String str=sc.nextLine();
		getOut(str);
		}
		sc.close();
	}

	private static void getOut(String str) {
		int len=str.length();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<len;j++) {
				if(i==j ) {
					System.out.print(str.charAt(i)+" ");
				}else if(i+j == len-1) {
					System.out.print(str.charAt(i)+" ");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
