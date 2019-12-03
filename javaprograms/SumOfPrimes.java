package javaprograms;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int num = sc.nextInt();
			int sum=0;
			int temp=num;
			
			while(temp!=0) {
				//System.out.print(temp+" "+isPrime(temp%10)+" ");
				if(isPrime(temp%10) ){
					sum+=(temp%10);
				}temp/=10;
				
			}
			System.out.println(sum);
			
		}
		
		
	}

	private static boolean isPrime(int temp) {
		int i;
		for(i=2;i<temp;i++) {
			if(temp%i ==0)
				break;
		}
		if(i==temp)
		return true;
		else
		return false;
	}

}
