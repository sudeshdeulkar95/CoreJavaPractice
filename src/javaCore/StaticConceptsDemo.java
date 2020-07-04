package javaCore;
// Important Concepts of Static Variable and Static Methods
// Static Block
public class StaticConceptsDemo {

	String name; // Instance Variable
	String flat; // Instance Variable
	static String city; // Class Variables
	static int i; // Static variables are shared variables and can be initialized only once
	
	static{ //Static block to declare and initialize all static variables
		city = "Mira-Road";
		i = 0;
	}
	
	public StaticConceptsDemo(String name, String flat){
		
		this.name = name; // Local Variable 'name'
		this.flat = flat; // Local Variable 'flat'
		i++;
		System.out.println(i);
	}
	
	
	//Non-static method 
	public void getName(){
		System.out.println(name + " " + city);	
	}
	
	//Non-static method
	public void getFlat(){
		System.out.println(flat + " " + city);
	}
	
	public static void getCity(){ // Static methods can be called by the class name
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We have a common parameter of city amongst all the objects hence declaring it as a static variable and sharing it with class
		StaticConceptsDemo scd0 = new StaticConceptsDemo("Sudesh","B408");
		StaticConceptsDemo scd1 = new StaticConceptsDemo("Indra","B608");
		StaticConceptsDemo scd2 = new StaticConceptsDemo("Rahul","A404");
		
		scd0.getName();
		scd1.getName();
		scd2.getName();
		
		StaticConceptsDemo.getCity();	
	}

}
