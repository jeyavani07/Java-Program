package arrayPrograms;

import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int num=sc.nextInt();
			int rev=0;
			if(isPrime(num)) {
				int temp=num;
				while(temp!=0) {
					rev=rev*10+temp%10;
					temp/=10;
				}
				if(isPrime(rev)) {
					System.out.println("Yes");
				}else
					System.out.println("No");
			}else
				System.out.println("No");
		}
//			String sr=String.valueOf(num);
//			for(int i=0;i<sr.length();i++) {
//				rev=rev*10+Integer.parseInt(String.valueOf(sr.charAt(i)));
//			}
//			if(String.valueOf(rev).equals(sr)) {
//				System.out.println("Yes");
//			}
			
			//System.out.println("Reverse: "+rev);
			
		

		
		/*
			Input:
			2
			97
			43
			
			Output:
			Yes
			No
		 */
	}

	private static boolean isPrime(int num) {
		int i;
		for(i=2;i<num;i++) {
			if(num%i ==0) {
				break;
			}
		}
		if(i==num) {
			return true;
		}else {
			return false;
		}
	}

}
