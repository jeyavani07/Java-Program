package arrayPrograms;

import java.util.Arrays;

public class FirstOccurenceOfElement {

	public static void main(String[] args) {
int a[]= {66,88,3,33,6,12,90,42,68,73,27};
int ele=75,index=-1;
Arrays.sort(a);
System.out.println(Arrays.toString(a));
int low=0,high=a.length-1;
while(low<=high) {
	int mid=(low+high)/2;
	if(ele<a[mid]) {
		high=mid-1;
	}else if(ele>a[mid]) {
		low=mid+1;
	}else {
		index=mid;
		break;
	}
}
if(index==-1) {
	index=low;
	System.out.println("The element is not present and can be inserted in position :"+index);
}else
System.out.println("The element is found in position: "+index);
	}

}
