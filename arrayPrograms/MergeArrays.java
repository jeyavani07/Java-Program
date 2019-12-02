package arrayPrograms;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
	int a[]= {2,8,15,18,26};
	int b[]= {5,9,12,17,25,32};
	int c[]=new int[a.length+b.length];
	/*
	 
	while(i!=a.length && j!=b.length) {
		if(a[i]<b[j] && i!=a.length) {
			c[k++]=a[i];
			i++;
		}
		else if(a[i]>b[j] && j!=b.length) {
			c[k++]=b[j];
			j++;
		}else {
			c[k++]=a[i];i++;j++;
		}
	}
	while(i!=a.length) {
		c[k++]=a[i++];
	}
	while(j!=b.length) {
		c[k++]=b[j++];
	}
	for(int p:c) {
		System.out.println(p+" ");
	}
*/
	int i=0,j=0;
	for(int k=0;k<a.length+b.length;) {
		while(i!=a.length) {
			c[k++]=a[i];
			i++;
		}
		while(j!=b.length) {
			c[k++]=b[j];
			j++;
		}
	}
	Arrays.sort(c);
	
	for(int p:c) {
		System.out.println(p+" ");
	}
	}

}
