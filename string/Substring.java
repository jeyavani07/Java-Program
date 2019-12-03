package string;

import java.util.Scanner;

public class Substring {
public static int find(String s,String s1) {
	int flag=0;
	for(int i=0;i<=s.length()-s1.length();i++) {
		System.out.println(s.substring(i,s1.length()+i));
		if(s.substring(i, s1.length()+i).equals(s1)) {
			flag=1;
			break;
		}
	}
	return flag;
}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string : ");
String s=sc.nextLine();
System.out.println("Enter the substring : ");
String s1=sc.nextLine();
int flag=find(s,s1);
if(flag==1) {
	System.out.println("Substring is found");
}else
		System.out.println("Substring is not found");
sc.close();
	}

}
