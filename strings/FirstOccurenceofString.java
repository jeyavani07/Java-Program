package strings;

public class FirstOccurenceofString {

	public static void main(String[] args) {
String str="Hello Geeks for Geeks";
String sub="Geeks";
int pos=str.indexOf(sub)+sub.length()-1;
System.out.println(pos);
	}

}
