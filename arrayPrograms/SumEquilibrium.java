package arrayPrograms;

import java.util.*;

public class SumEquilibrium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {				
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				if(sumbef(i,arr)==sumaft(i,arr)) {
				System.out.println(arr[i]);
				break;
				}
			}
		}
	}

	private static int sumbef(int ind,int arr[]) {
		if(ind==0)
			return arr[0];
		int sum=0;
		for(int i=0;i<ind;i++) {
			sum+=arr[i];
		}
		System.out.println("Before"+sum);
		return sum;
	}

	private static int sumaft(int ind, int[] arr) {
		int sum=0;
		if(ind==arr.length-1)
			return arr[arr.length-1];
		for(int i=ind+1;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("After"+sum);
		return sum;
	}

}
