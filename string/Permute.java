package string;

import java.util.Scanner;

public class Permute {
	public static String swap(String s,int i,int j) {
		char ch[]=s.toCharArray();
		char c;
		c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
		return String.valueOf(ch);
	}
	static void permute(String str,int start,int end) {
		if(start==end) {
			System.out.println(str);
		}
		for(int i=start;i<end;i++) {
			str= swap(str,start,i);
			permute(str,start+1,end);
			str=swap(str,start,i);
		}
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
permute(st,0,st.length());
	}

}
