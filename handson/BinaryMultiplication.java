package handson;

import java.util.Scanner;

public class BinaryMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long b1=sc.nextLong();
		long b2=sc.nextLong();
		//long fact=1;
		long b=b1;
		int len=0;
		while(b!=0) {
			len++;
			b/=10;
		}
		long pro[]=new long[len];
		int i=0;
		while(b1!=0) {
			pro[i++]=(b1%10)*(b2%10);
			b1/=10;
			b2/=10;
		}
		
		System.out.println("The product is ");
		for(long c:pro) {
		System.out.print(c);
		}
		sc.close();
	}

}
