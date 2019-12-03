package strings;

import java.util.Scanner;

public class IPv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String st = sc.next();
			if (isValid(st))
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

	private static boolean isValid(String s) {
		int flag = 0;
		String str[] = s.split("\\.");
		if(str.length!=4) {
			return false;
		}else {
			for (int i = 0; i < 4; i++) {
				if(str[i].length()>0 && str[i].length()<=3) {
					char ch[]=str[i].toCharArray();
					flag=0;
					for(int i1=0;i1<ch.length;i1++) {
						if(Character.isDigit(ch[i]))
							flag=1;
						else {
							flag=0;break;
						}
					}if(flag==1) {
					if(Integer.valueOf(str[i])>=0 && Integer.valueOf(str[i])<=255) {
						return true;
					}
					else
						break;
					}else
							break;
				}else
					break;
			}
		}
		
		return false;
	}
}
/*
 * Input 4 222.111.111.111 5555..555 0000.0000.0000.0000 1.2.3.04
 * 
 * Output 1 0 0 0
 */