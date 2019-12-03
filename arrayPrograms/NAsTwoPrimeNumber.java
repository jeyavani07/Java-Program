package arrayPrograms;

import java.util.Scanner;

public class NAsTwoPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 74;
		findPrimeNumber(n);
	}

	private static void findPrimeNumber(int n) {
		boolean isPrime[] = new boolean[n + 1];
		sieve(n,isPrime);
		for(int i=2;i<=n;i++) {
			if(isPrime[i] && isPrime[n-i]) {
				System.out.println(i + " "+( n-i));
			}
		}
	}
		

	

	private static void sieve(int n, boolean[] isPrime) {
		for(int p=2;p<=n;p++) {
			isPrime[p]=true;
		}
		isPrime[0] = isPrime[1] = false;
		for (int p = 2; p * p <= n; p++) {
			if(isPrime[p]==true) {
			for (int i = p * p; i <= n; i += p) {
				isPrime[i] = false;
			}
			}
		}		
	}

}
