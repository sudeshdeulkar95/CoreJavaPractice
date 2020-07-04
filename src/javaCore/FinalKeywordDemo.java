package javaCore;

//Final Classes cannot be inherited
public final class FinalKeywordDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 1;
		//i=2; This cannot be done as the variable is declared as final and its value cannot be changed
	}
	
	public final void returnString(){ //Final Methods cannot be overridden however final methods can be overloaded
		System.out.println("Sudesh");
	}
	

}
