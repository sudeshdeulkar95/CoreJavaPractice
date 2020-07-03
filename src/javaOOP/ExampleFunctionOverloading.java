package javaOOP;

//Function Overloading has two or more methods with same name but different arguments
//Also different return types
public class ExampleFunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = calculateMethod(2);
		calculateMethod(2,3);
		
		System.out.println(x);		
	}
	
	public static int calculateMethod(int a){
		int c = a*a;
		return c;
	}
	
	public static void calculateMethod(int a,int b){
		System.out.println(a*b);
	}

}
