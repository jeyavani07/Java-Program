package javaprograms;

import java.util.Scanner;

public class NumberToWords {
	static String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static String tens[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int num = sc.nextInt();
			int temp = num;
			int count = 0;
			if(num==0) {
				System.out.println("zero");
				System.exit(0);
			}
			while (temp != 0) {
				count++;
				temp = temp / 10;
			}
			//System.out.println("count : "+count);
			int a[] = new int[count];
			int i = count -1;
			temp = num;
			
			while (temp != 0) {
				a[i--] = (temp % 10);
				temp /= 10;
			}
			//System.out.println(a.toString());
			switch (count) {
			case 4:
				if(a[count-1]==0) {
					if(a[count-2]==0) {
						if(a[count-3]==0) {
							System.out.println(ones[a[0]]+" thousand");
						}else {
							System.out.println(ones[a[0]]+" thousand "+ones[a[count-3]]+" hundred");
						}
					}else {
						System.out.println(ones[a[0]]+" thousand "+ones[a[count-3]]+" hundred and "+tens[a[count-2]]);
					}
				}else {
					System.out.println(ones[a[0]]+" thousand "+ones[a[count-3]]+
							" hundred and "+tens[a[count-2]]+" "+ones[a[count-1]]);
				}break;
			case 3:
				if(a[count-1]==0) {
					if(a[count-2]==0) {
						System.out.println(ones[a[0]]+" hundred");
					}else {
						System.out.println(ones[a[0]]+" hundred and "+tens[a[count-2]]);
					}
				}
				else if(a[count-2]==0){
					System.out.println(ones[a[0]]+" hundred and"+tens[a[count-2]]+" "+ones[a[count-1]]);
				}else {
					System.out.println(ones[a[0]]+" hundred and "+tens[a[count-2]]+" "+ones[a[count-1]]);
				}

				    break;
			case 2:
				if(a[count-1]==0) {
					//System.out.println("ones is zero");
					System.out.println(tens[a[0]]);
				}else {
					System.out.println(tens[a[0]]+" "+ones[a[1]]);
				}break;
			case 1:
				System.out.println(ones[a[0]]);
			break;
				
			}
		}
		sc.close();

	}

}
