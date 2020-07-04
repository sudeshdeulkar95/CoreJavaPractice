package javaCore;

public class ThisKeywordDemo {
	
	int a = 2; //Variable at class level
	
	public void myMethod(){
		int a = 3; //Variable at method level
		System.out.println(a);
		
		// 'this' keyword refers to the object at the class level
		
		System.out.println(this.a); // Use of this variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo tkyd = new ThisKeywordDemo();
		tkyd.myMethod();
	}

}
