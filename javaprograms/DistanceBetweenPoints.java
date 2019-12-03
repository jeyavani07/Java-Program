package javaprograms;

import java.util.Scanner;

public class DistanceBetweenPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			System.out.println((int)Math.round(Math.sqrt(((y2-y1)*(y2-y1)+((x2-x1)*(x2-x1))))));
			}
		}
		
		
		/*
		 * Input:
			4
			0 0 2 -2
			-20 23 -15 68
			30 37 79 -51
			-69 63 57 11
			
			Output:
			3
			45
			101
			136
		 */
	}


