package strings;

import java.util.Scanner;

public class ReverseWithSpacesIntact {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String str = sc.nextLine();
			char ch[] = str.toCharArray();
			char c;
			for (int i = 0, j = ch.length - 1; i <= j;) {
				if(ch[i]!= ' ' && ch[j]!=' ') {
					c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
					i++;
					j--;
				}
				else if(ch[i] ==' ' && ch[j] !='0') {
					i++;
				}else if(ch[j]==' ' && ch[i]!='0'){
					j--;
				}else {
					i++;j--;
				}
					
			}
					
					
					
					
//				if (ch[i] != ' ') {
//					if (ch[j] != ' ') {
//						c = ch[i];
//						ch[i] = ch[j];
//						ch[j] = c;
//						i++;
//						j--;
//					} else {
//						j--;
//					}
//
//				} else {
//					i++;
//					if (ch[j] == ' ') {
//						j--;
//					}
//				}
//				}
			
			System.out.println(String.valueOf(ch));
		}
		sc.close();
	}
}
