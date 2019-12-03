package handson;

import java.util.Scanner;

public class TotalCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[size];
			int count=0;
			for(int i=0;i<size;i++) {	
				arr[i]=sc.nextInt();
				count+=arr[i]/k;
				if(arr[i]%k!=0){
				count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
		/*
Input:
1
4 3
5 8 10 13

Output:
14
 */
	}

}
