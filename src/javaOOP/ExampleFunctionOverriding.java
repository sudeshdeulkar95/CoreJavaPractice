package javaOOP;

//Function Overriding is changing the implementation of the parent method in the child class
//Everything other remains same
public class ExampleFunctionOverriding extends MyAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAbstractClass mac = new ExampleFunctionOverriding();
		mac.myImplementedMethod();
		
		ExampleFunctionOverriding efo = new ExampleFunctionOverriding();
		efo.myImplementedMethod();
		
		//Both will print the string present in the current class
		//If you comment the myImplementedMethod() in this class then it will print the string from the same method in the parent class
	}

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is implemented method which is present in child class");
	}
	
	public void myImplementedMethod(){
		System.out.println("This is the overriden method from parent class");
	}
	
	

}
