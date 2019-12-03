package handson;

public class FindRemainder {

	public static void main(String[] args) {
		int a = 67, b = 7, temp = a;
		while (b < a) {
			a -= b;
		}
		System.out.println(a);

		int div = temp / b;
		int res = temp - div * b;
		System.out.println(res);
	}

}
