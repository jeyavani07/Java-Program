package strings;

public class Ascii {

	public static void main(String[] args) {
			char ch='a';
			int i=ch;
			System.out.println(ch+" "+i);
			ch='z';
			i=ch;
			System.out.println(ch+" "+i);
			ch='A';
			i=ch;
			System.out.println(ch+" "+i);
			ch='Z';
			i=ch;
			System.out.println(ch+" "+i);
			ch='0';
			i=ch;
			System.out.println(ch+" "+i);
			ch='9';
			i=ch;
			System.out.println(ch+" "+i);
			System.out.println();
			i=58;
			while(i!=65) {
			ch=(char)i;
			System.out.println(ch+" "+i);
			i++;
			}
			System.out.println();

			i=91;
			while(i!=97) {
				ch=(char)i;
				System.out.println(ch+" "+i);
				i++;
			}
			


	}

}
