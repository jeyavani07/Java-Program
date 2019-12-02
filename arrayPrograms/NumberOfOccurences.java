package arrayPrograms;

import java.util.Scanner;

public class NumberOfOccurences {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int ele=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
		}
sc.close();
	}

}
