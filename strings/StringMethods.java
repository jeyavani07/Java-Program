package strings;

public class StringMethods {

	public static void main(String[] args) {
		String str="Hello";
//		str=str.concat(" ").concat("World");
//		System.out.println(str);
//		System.out.println(String.format("%5e", 78530000.00));
//		System.out.println(String.format("|%10d|", 345));		//right padding
//		System.out.println(String.format("|%-10d|", 345));		//left padding
//		System.out.println(String.format("|%010d|", 345));		//fill with zeroes
//		System.out.println(String.format("|%4d|", 345));
//		System.out.println(String.format("|% d|", 345));
//		
		
		//Byte Array of the Strings
		
//		String s="`1234567890-=~!@#$%^&*()_+";
//		byte arr[]=s.getBytes();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(s.charAt(i)+" "+arr[i]);
//		}

		
		str="javatpoint";
		System.out.println(str.indexOf('t', 6));    //fromindex
		
		//getchars()
		str="hello javatpoint hi all";
		char ch[]=new char[16]; 
		str.getChars(6, 16, ch, 1);  //fromindex, toindex, destination, from index of destination
		System.out.println(ch);



	}

}
