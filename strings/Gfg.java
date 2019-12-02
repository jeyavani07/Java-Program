package strings;

public class Gfg {
	String encode(String str)
	{
	    String s="";
          for(int i=0;i<str.length();i++) {
				int j=1;
				while(i<str.length()-1 && str.charAt(i+1)==str.charAt(i)) {
					i++;
					j++;
				}
				s+=str.charAt(i);
				s+=String.valueOf(j);
				//System.out.print(" i: "+i+" j: "+j);
			//	System.out.print(str.charAt(i));
			//	System.out.print(j);
				//System.out.println();
			}
			return s;
	}
}
