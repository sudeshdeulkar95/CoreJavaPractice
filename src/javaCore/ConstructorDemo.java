package javaCore;

//Block of code which executes when the object is created is called a constructor
//Method name is same as that of the class
//Constructor will not return any value
//If you do not define a constructor, the compiler will implicitly define a constructor for the user
//You can create a parameterized constructor also
//Once you define a constructor you the compiler will not create one for you
public class ConstructorDemo {
	
	//Basic Constructor Example
	public ConstructorDemo(){
		System.out.println("This is my constructor line");
	}
	
	//Parameterized Constructor
	public ConstructorDemo(int a,int b){
		System.out.println(a*b);
	}
	
	public void simpleMethod(){
		System.out.println("This is my simple method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cd = new ConstructorDemo(); //Calling the basic constructor
		cd.simpleMethod();
		
		ConstructorDemo cdd = new ConstructorDemo(4,5); //Calling the parameterized constructor
		cdd.simpleMethod();		
	}

}
