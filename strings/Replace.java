package strings;

public class Replace {

	public static void main(String[] args) {
String str="hello";
System.out.println(str.replace(" ", ""));
System.out.println(str);
StringBuffer st=new StringBuffer(str);
st=st.reverse();
System.out.println(st);

	}

}
