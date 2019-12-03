package handson;

public class PrimeNumber {

	public static void main(String[] args) {
		int sum = 0, i = 0,count=0;
		for (int a = 1; count<=100; a++) {
			i = 0;
			for (int j = 1; j <= a; j++) {
				if (a % j == 0) {
					i++;
				}

			}
			if (i == 2) {
				count++;
				System.out.print(a + " ");
				sum += a;
			}
		}
		System.out.println("\nThe sum of the prime numbers is :"+sum);
	}

}
