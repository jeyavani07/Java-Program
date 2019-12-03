package handson;

public class DecimalToHex {

	public static void main(String[] args) {
		int num = 64, temp = num, len = 0, rem = 0;
		while (temp != 0) {
			len++;
			temp /= 10;
		}
		int i = 0;
		char hex[] = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hex_dec="";
		while(num!=0) {
			rem=num%16;
			hex_dec=hex[rem]+hex_dec;
			num/=16;
		}
		
		System.out.println("The Hexadecimal number is : "+hex_dec);
		
		System.out.println("\nJava Version: 		"+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version:	 "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: 		"+System.getProperty("java.home"));
	    System.out.println("Java Vendor: 		"+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: 	"+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: 	"+System.getProperty("java.class.path")+"\n");
	 

	}

}
