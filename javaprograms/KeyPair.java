package javaprograms;

import java.util.*;

public class KeyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int flag=0;
			int size = sc.nextInt();
			int sum=sc.nextInt();
			HashSet<Integer> hs=new HashSet<Integer>();
			for (int i = 0; i < size; i++) {
				hs.add(sc.nextInt());
			}
			int x=0;
			for(Integer i:hs) {
				if(x<hs.size()-1) {
				System.out.println(i);
				if(hs.contains(sum-i)){
					flag=1;
					break;
				}else {
					flag=0;
				}
				x++;
				}
			}
			if(flag==0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}

}
/*
 * Input:
2
6 16
1 4 45 6 10 8
5 10
1 2 4 3 6

Output:
Yes
Yes
*/
