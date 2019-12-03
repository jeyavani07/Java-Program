package handson;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long dec[] = new long[100];
		int i = 0;
		while (num != 0) {
			dec[i++] = num % 2;
			num = num / 2;
		}
		i--;
		System.out.println("The binary number is : ");
		for(int j=i;j>=0;j--) {
			System.out.print(dec[j]);
		}
		sc.close();
	}

}
