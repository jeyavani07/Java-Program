package arrayPrograms;

public class MaxContiguousSubArray {
	public static int MaxSum(int a[]) {
		int crnt = a[0], global = a[0];
		for(int i=1;i<a.length;i++) {
			crnt=Math.max(a[i], crnt+a[i]);
			if(crnt>global) {
				global=crnt;
			}
		}
		return global;
	}

	public static void main(String[] args) {
		int arr[] = { -1, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("The maximum sum of the contiguous subarray is " + MaxSum(arr));
	}

}
