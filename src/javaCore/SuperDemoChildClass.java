package javaCore;

public class SuperDemoChildClass extends SuperDemoParentClass {

	public SuperDemoChildClass(){
		super(); //Super() must be called at the very first line as it calls the parent constructor
		System.out.println("Text Constructor From Child Class");
	}
	
	String name = "Child";
	
	//Overridden method from Parent
	public void mySimpleMethod(){
		System.out.println("My Child Class Method");
		super.mySimpleMethod(); // Super will call the method from the parent
	}
	
	public void methodName(){
		
		System.out.println(name); // Will call the variable from the child class
		System.out.println(super.name); // Will call the variable from the parent class
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This line will call the constructor from parent class if the child constructor is not created
		SuperDemoChildClass sdcc = new SuperDemoChildClass();
		
		sdcc.mySimpleMethod();
		sdcc.methodName();
		
		//Will print the name from the parent if the child has not overridden it
		System.out.println(sdcc.name);
	}

}
