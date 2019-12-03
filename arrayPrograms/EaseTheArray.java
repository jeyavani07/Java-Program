package arrayPrograms;

import java.util.*;

public class EaseTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1] && arr[i]!=0) {
					arr[i]=2*arr[i];
					arr[i+1]=0;
					i++;
				}
			}
			int i=0,j=0;
			while(i<arr.length && j<arr.length) {
//				if(arr[i]== 0 && arr[i+1]!=0) {
//					arr[i]=arr[i+1];
//					arr[i+1]=0;
//					continue;
//				}i++;
				if(arr[i]==0) {
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						i++;
					}else
						j++;
				}else
					i++;j++;
			}
			for(int p:arr){
				System.out.print(p+" ");
			}
		}
	}

}
/*
Input:
2
5
2 2 0 4 4
5
0 1 2 2 0
Output:
4 8 0 0 0
1 4 0 0 0
*/