package handson;

import java.util.Scanner;

public class CoinChange {
	public static int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of iterations:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the denominations: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < n; i++) {
			int temp = a[i];
			int fin = coins.length - 1;
			
			while (temp < coins[fin]) {
				fin--;
			}
			
			
			while (temp != 0) {
				if (temp >= coins[fin]) {
					temp -= coins[fin];
					System.out.print(coins[fin] + " ");
				} else {
					fin--;
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
