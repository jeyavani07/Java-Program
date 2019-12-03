package string;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
String str1=null,str2=null;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string :");
str1=sc.nextLine(); //hello
System.out.println("Enter the second string :");
str2=sc.nextLine(); //world
str1=str1.concat(str2); //helloworld
str2=str1.substring(0,str1.length()-str2.length());   // (0,5)   //hello
str1=str1.substring(str2.length());  //(5,10) //world
System.out.println("String 1: "+str1+"\nString 2: "+str2);
sc.close(); 
	}

}
