package handson;

import java.util.Scanner;

public class LessCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=n,count=0;
		while(res!=0) {
			if(res%2 !=0) {
				res-=1;
			}else{res/=2;}
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
