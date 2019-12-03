package string;

public class Practise {

	public static void main(String[] args) {
		char ch[] = { 'v', 'A', 'N', 'I' };
		String s = String.valueOf(ch);
		System.out.println("string :" + s);
		ch = s.toCharArray();
		for (char c : ch) {
			System.out.print(c);
		}
		System.out.println();
		int radius=5;
		System.out.println("area of the circle is: "+radius*radius*Math.PI);
	}

}
