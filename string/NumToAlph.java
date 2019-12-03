package string;

public class NumToAlph {

	public static void main(String[] args) {
		char ch[] = { '1', '2', '3', '4' };
		if (ch[0] > ch[2]) {
			System.out.println(ch[0] - ch[2]);
		} else
			System.out.println(ch[2] - ch[0]);
		
		//System.out.println(findCount(ch,ch.length));
	}

	private static int findCount(char[] ch,int n) {
		if(n==1)
			return 1;
		int count=findCount(ch,n-1);
		System.out.println(count);
		return count;
			
	}

}
