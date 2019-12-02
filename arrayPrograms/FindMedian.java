package arrayPrograms;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedian {
	public static void main(String[] args)
	 {
	    int[] nums = {10,2,45,23,38,23,21,78,92,107,56,790,34,67};
	    Arrays.sort(nums);
	    System.out.println(Arrays.toString(nums)+"\nlength is "+nums.length);
	    int n = nums.length;
			if (n < 1) {
				System.out.printf("False");
			}
			Queue<Integer> min = new PriorityQueue<Integer>(n);
			for (int num : nums) {
				min.add(num);
			}
			if ((n & 1) == 0) {
				n >>= 1;
				n -= 1;
			} else {
				n >>= 1;
			}
			int i = 0;
			while (i < n) {
				min.remove();
				i++;
			}
			System.out.print(min.remove()); 
	    }
}
