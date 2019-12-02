package sorting;

public class QuickSort {
	static void sort(int a[],int l,int h) {
		if(l<h) {
			int i=part(a,l,h);
			sort(a,l,i);
			sort(a,i+1,h);
		}
	}
	static int part(int a[],int l,int h) {
		int i=l,j=h+1,pivot,temp;
		pivot=a[l];
		while(i<j) {
			do {
				i++;
			}while(a[i]<=pivot);
			do {
				j--;
			}while(a[j]>pivot);
			if(i<j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[l];
		a[l]=a[j];
		a[j]=temp;
		return j;
	}

	public static void main(String[] args) {
int a[]= {10,16,8,12,15,6,3,9,5};
sort(a,0,a.length-1);
for(int i:a) {
	System.out.print(i+"  ");
}

}
}
