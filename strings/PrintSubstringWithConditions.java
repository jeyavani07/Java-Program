package strings;

import java.util.Scanner;

public class PrintSubstringWithConditions {

	public static void main(String[] args) {
		/*
		  Input:
			2
			Thisisdemostring
			i    
			3​
			geeksforgeeks
			e
			2

			Output:
			ng
			ksforgeeks


		 */
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int dupcount=0;
		while(n-- >0) {
			dupcount=0;
			String str=sc.next();
			char c=sc.next().charAt(0);
			//System.out.println(c);
			int count=sc.nextInt();
			int i=0;
			for(i=0;dupcount<count && i!=str.length();i++) {
				if(str.charAt(i)==c) {
					dupcount++;
				}
			}
			System.out.println(str.substring(i));

				if(str.substring(i).length()==0)
					System.out.println("Empty String");
				else
					System.out.println(str.substring(i));
		}
		sc.close();
	}

}
