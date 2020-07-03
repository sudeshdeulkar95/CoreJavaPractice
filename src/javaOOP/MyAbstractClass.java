package javaOOP;

//Abstract Class contains method implemented and non implemented methods both.
//If a class contains even 1 abstract method or variable then the class should be declared as abstract.
public abstract class MyAbstractClass {
	
	String myVar = "InheritedVariable";
	
	//Non Abstract Method can be directly inherited into the child class
	public void myImplementedMethod(){
		System.out.println("This is my already implemented method which is present in parent class");
	}
	
	//Abstract method has no implementation and needs to be implementing in child class
	public abstract void myAbstractMethod();
}
