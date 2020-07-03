package javaOOP;

//A class cannot inherit more than one class
public class MyAbstractInheritingClass extends MyAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass mac = new MyAbstractInheritingClass();
		mac.myImplementedMethod();
		mac.myAbstractMethod();	
		
		System.out.println(mac.myVar); //You can inherit a variable also
		
	}
	
	//Writing implementation for the Abstract Method in the Child Class
	//You need to implement the methods in child class which are not implemented in parent class
	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is implemented method which is present in child class");
	}

}
