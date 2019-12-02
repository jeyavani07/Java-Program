package strings;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
				String str=sc.next();
				int occ=sc.nextInt();
				int charcount=0;
				int count=1;
				char ch[]=str.toCharArray();
				for(int i=0;i<ch.length;i++) {
					count=1;
					int j=i+1;
					
					
					while(j<ch.length) {
						if(ch[i]!='0') {
						if(ch[i]==ch[j]) {
							count++;
							ch[j]='0';
						}
						j++;
						}else {
							break;
						}
					}
					
					if(count==occ && ch[i]!='0') {
						charcount++;
					}
					}	
				System.out.println(charcount);
		}
		
		
		sc.close();
	}

}
