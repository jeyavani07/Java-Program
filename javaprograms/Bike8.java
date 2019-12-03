package javaprograms;
class Bike{
	Bike(){
		System.out.println("inside bike");
	}
	{System.out.println("inside parent class instance");
}}
class Bike8 extends Bike{  
    int speed;  
      
    Bike8(){
    	super();System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  

    public static void main(String args[]){  
    @SuppressWarnings("unused")
	Bike8 b1=new Bike8();  
    @SuppressWarnings("unused")
	Bike8 b2=new Bike8();  
    }     
}