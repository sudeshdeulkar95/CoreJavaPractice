package javaOOP;

public class MyInterfaceImplementingClass implements MyFirstInterface,MySecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A class may implement multiple interfaces
		// A class has to implement all the methods inside the interface
		// To call the methods of the interface,you create a reference variable of the interface and assign it to the instance of the class 
		
		MyFirstInterface mfi = new MyInterfaceImplementingClass();
		mfi.myFirstMethod();
		mfi.mySecondMethod();
		mfi.myThirdMethod();
		
		MySecondInterface msi = new MyInterfaceImplementingClass();
		msi.myFourthMethod();
		
		MyInterfaceImplementingClass iic = new MyInterfaceImplementingClass();
		iic.myAdditionalMethod();
	}

	@Override
	public void myFirstMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is my first method");
	}

	@Override
	public void mySecondMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is my second method");
	}

	@Override
	public void myThirdMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is my third method");
	}

	@Override
	public void myFourthMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is my fourth method");
	}
	
	public void myAdditionalMethod(){
		System.out.println("This is my additional method");
	}

}
