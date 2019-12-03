package javaprograms;

import java.util.Scanner;

public class StringReverseUsingRecursion {
//	static String reverse(String str) {
//		if(str.length()==1) {
//			//return str+str.charAt(str.length()-1);
//		}
//		else {
//			
//		}
//	}
//public static void main(String [] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the string: ");
//	String str=sc.nextLine();
//	String st=reverse(str);
//	System.out.println("The reversed string is"+st);
//	sc.close();
//}
	public static void main(String[] args)
    {
        String blogName = "How To Do In Java ";
         
        String reverseString = reverseString(blogName);
         
        System.out.println(reverseString);
    }
     
    public static String reverseString(String string)
    {
        if (string.isEmpty()){
         return string;
        }
        //Calling function recursively
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}
