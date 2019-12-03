package handson;

public class FirstLetterToUpperCase {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String str = "the quick brown fox jumps over the lazy dog";
		char ch[] = str.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		int i = 0;
		while (i != ch.length) {
			if (Character.isSpace(ch[i])) {
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
			}
			i++;
		}
		String s = String.valueOf(ch);
		System.out.println(s);
		String words[]=str.split("\\s+");
		System.out.println(words[words.length-2]);

	}

}
