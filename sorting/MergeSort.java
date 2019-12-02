package sorting;
public class MergeSort 
{ 
   void merge(int arr[],int l,int m,int r)
   {
	   int n1=m-l+1;
	   int n2=r-m;
	   int L[]=new int[n1];
	   int R[]=new int[n2];
	   for(int i=0;i<n1;i++) {
		   L[i]=arr[l+i];
	   }
	   for(int j=0;j<n2;j++) {
		   R[j]=arr[m+1+j];
	   }
	   int i=0,j=0,k=l;
	   while(i!=n1 && j!=n2) {
		   if(L[i]<R[j]) {
			   arr[k++]=L[i++];
		   }
		   else {
			   arr[k++]=R[j++];
		   }
	   }
	   while(i!=n1) {
		   arr[k++]=L[i++];
	   }
	   while(j!=n2) {
		   arr[k++]=R[j++];
	   }
   }
   void sort(int arr[],int l,int r) {
	   int mid;
	   if(l<r) {
		   mid=(l+r)/2;
		   sort(arr,l,mid);
		   sort(arr,mid+1,r);
		   merge(arr,l,mid,r);
	   }
   }
   static void printArray(int arr[]) {
	   for(int i:arr) {
		   System.out.println(i+" ");
	   }
   }
   public static void main(String[] args) {
	   MergeSort ob=new MergeSort();
	   int arr[]= {18,7,4,30,9,21,15,2,16,26};
	   ob.sort(arr,0,arr.length-1);
	   printArray(arr);
   }
} 