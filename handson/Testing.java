package handson;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
//boolean a[][]= new boolean[3][3];
//
//for(int i=0;i<3;i++) {
//	Arrays.fill(a[i], false);
//}
//for(int i=0;i<3;i++) {
//	for(int j=0;j<3;j++) {
//		System.out.println(a[i][j]);
//	}
//	
//}
		int a[]= {3,4,5};
		String s="";
		for(int i=0;i<a.length;i++)
				s+=String.valueOf(a[i]);
	System.out.println(s);
	int x=10;
	System.out.println(Integer.parseInt(s)+x);
	//String st="3";
	//System.out.println(s+st);
		
	}

}
