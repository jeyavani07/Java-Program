package strings;

import java.util.Scanner;

public class LongestRepeatingSequence {
public static String find(String s,String st) {
	int n=Math.min(s.length(), st.length());
	for(int i=0;i<n;i++) {
		if(s.charAt(i)!=st.charAt(i)) {
			return s.substring(0,i);
		}
	}
	return s.substring(0,n);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		String longest="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String s=find(str.substring(i,str.length()),str.substring(j,str.length()));
				if(s.length()>longest.length()) {
					longest=s;
				}
			}
		}
		System.out.println("The longest sequence is :"+longest);
	}

}
