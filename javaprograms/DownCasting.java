package javaprograms;
class Animal { }  
class Dog3 extends Animal {  
	  static void method(Animal a) {  
	    if(a instanceof Dog3){  
	       Dog3 d=(Dog3)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	    } 
	    
	  }}
class Cat extends Animal{
	static void method(Animal a) {
		if(a instanceof Cat) {
			Cat c=(Cat)a;
			System.out.println("Downcasting in cat");
		}
	}
}
public  class DownCasting {
	public static void main (String [] args) {  
	    Animal a=new Dog3();  
	    Dog3.method(a); 
	   Animal b=new Cat();
	    Cat.method(b);
	  }  
}
