package strings;

public class ChangingCase {

	public static void main(String[] args) {
String str="Great Men are Born in FebrUarY";
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++) {
	
	if(Character.isLowerCase(ch[i])) {
		ch[i]=Character.toUpperCase(ch[i]);
	}else {
		ch[i]=Character.toLowerCase(ch[i]);
	}
}
System.out.println("Case changed string is : "+String.valueOf(ch));
	}

}
