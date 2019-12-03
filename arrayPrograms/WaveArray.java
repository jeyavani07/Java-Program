package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<size-1;) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=i+2;
			}
			System.out.println(Arrays.toString(a));
		}
		    /*Input:
			1
			5
			1 2 3 4 5
			Output:
			2 1 4 3 5
			*/
	}

}
