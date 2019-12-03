package strings;

public class Practice {

	public static void main(String[] args) {
String x="000367";
int y=12210045;
String s=String.valueOf(y);
System.out.println(s.replaceAll("0","5"));
int a[]= {3,5,7,2,1,8,9,25,99,23,65,42,28};
int max=a[0],pos=0;
for(int i=0;i<a.length-1;i++) {
	if(max<a[i])
	{
		max=a[i];
		pos=i;
	}
	//System.out.println(max);
}
System.out.println(max);
	}

}
