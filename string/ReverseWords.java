package string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n-- >0) {
	String str=sc.next();
	String s[]=str.split("\\.", 0);
	str="";
	for(int j=s.length-1;j>0;j--) {
		str=str+s[j]+".";
	}
	str+=s[0];
	System.out.println(str);
	//System.out.println();
}
	}
	/*Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/

}
