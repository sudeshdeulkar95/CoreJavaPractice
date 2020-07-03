package javaCore;

public class Basics {
	
	public void newMethod(){
		System.out.println("NewMethod String");
	}

	 int myVar = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Allocating a new memory using new operator
		Basics b = new Basics();
		
		//Object is an instance of a class
		//You can call the variable or method of the class using the object of a class
		System.out.println(b.myVar);
		
		//Calling a method using the object of a class
		b.newMethod();
		
		//Allocating memory for an object of another class in the same package
		OtherBasic ob = new OtherBasic();
		ob.anotherMethod();
		
		//The starting point of the method is from the main method
		//Comment : ln takes the control to the new line
		//System.out.println(myVar); //To be used only when the variable is a static variable
		System.out.println("This is my First Program");
		System.out.print("Hi ! This is Sudesh");

	}

}
