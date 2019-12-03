package handson;

public class Recursion {
public static void store(int n) {
	
		if(n==1)
			return;
	if(n%2 !=0) 
		System.out.print(n+" ");
		store(n-1);
		System.out.print(n+" ");
	
	
}
	public static void main(String[] args) {
int n=6;
store(n);
	}

}
