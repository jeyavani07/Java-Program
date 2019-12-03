package string;

import java.util.Scanner;

public class OddAndEvenString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size: ");
int size=sc.nextInt();
String str[]=new String[size];
System.out.println("Enter the strings:");
for(int i=0;i<size;i++) {
	str[i]=sc.next();
}
for(int i=0;i<size;i++) {
	for(int j=0;j<str[i].length();j=j+2) {
		System.out.print(str[i].charAt(j));
	}
	System.out.print(" ");
	for(int j=1;j<str[i].length();j=j+2) {
		System.out.print(str[i].charAt(j));
	}
	System.out.println();
}
sc.close();
	}

}
