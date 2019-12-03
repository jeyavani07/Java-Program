package javaprograms;

import java.util.Scanner;

public class DiffBnDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dayF=sc.nextInt();
		int monF=sc.nextInt();
		int yearF=sc.nextInt();
		int dayT=sc.nextInt();
		int monT=sc.nextInt();
		int yearT=sc.nextInt();
		int d=dayF,m=monF,y=yearF;
		int days=0;
		while(d!=dayT && m!=monT && y!=yearT) {
			if(m == 1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
				days=31-d;
			}else if(m == 2) {
				if((y%4==0 && y%100 !=100)|| (y%400==0)) {
					days=29-d;
				}else
					days=28-d;
			}else {
				days = 30-d;
			}
		}

	}

}
