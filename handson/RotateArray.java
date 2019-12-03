package handson;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 1 },i=0;
		int key = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i]=key;
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
	}

}
