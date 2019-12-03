package sorting;

import java.util.Scanner;

public class MergeSort {
void sort(int a[],int l,int r) {
	int mid;
	if(l<r) {
		mid=(l+r)/2;
		sort(a,l,mid);
		sort(a,mid+1,r);
		merge(a,l,mid,r);
		
	}
}

void merge(int a[],int l,int mid,int r) {
	int n1=mid-l+1;
	int n2=r-mid;
	int L[]=new int[n1];
	int R[]=new int[n2];
	for(int i=0;i<n1;i++) {
		L[i]=a[l+i];
	}
	for(int j=0;j<n2;j++) {
		R[j]=a[mid+1+j];
	}
	int i=0,j=0,k=l;
	while(i<n1 && j<n2) {
		if(L[i]<R[j]) {
			a[k++]=L[i++];
		}
		else {
			a[k++]=R[j++];
		}
	}
	while(i<n1) {
		a[k++]=L[i++];
	}
	while(j<n2) {
		a[k++]=R[j++];
	}
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		MergeSort m=new MergeSort();
		m.sort(a,0,len-1);
		for (int i : a) {
			System.out.println(i + " ");
		}
		sc.close();
		// 18 9 33 4 84 32
	}

}
