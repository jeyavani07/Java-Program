package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- >0) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int len=arr.length;
			int newarr[]=new int[len];
			for(int i=0;i<len;i++) {
				newarr[i]=0;
			}
			int j=0;
			for(int i=1;i<len;) {
				if(j+1<len) {
				if(arr[j++]==i) {
					newarr[i-1]+=1;
				}else {
					i++;
				}
				}
			}
			for(int i:newarr) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

/*
2
5
2 3 2 3 5
4
3 3 3 3
*/
