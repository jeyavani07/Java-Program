package javaprograms;
class AA{  
protected void msg(){System.out.println("Hello java");}  
}  
public class AccessModifiers extends AA{  
	protected void msg(){System.out.println("Hello java");}//C.T.Error  
	 public static void main(String args[]){  
		 AccessModifiers obj=new AccessModifiers();  
	   obj.msg();  
	   }  
	}  