package javaCore;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String is an inbuild class in Java
		 * We can define a String in 2 Ways i.e.
		 * 1) String Literal -- Two string variables with same string content will not create 2 objects
		 * Instead the 2nd string will point to the 1st string
		 * 2) String Object -- A new operator is used which will allocate separate memory for the string object
		 * Even if both the string contents are same
		 */
		
		//String Literal Declaration
		String literal = "myLiteralString";
		
		System.out.println(literal.length());
		
		String obj = new String(" myObject/String");
		
		System.out.println(obj.charAt(2)); //Gets the character a index[2]
		System.out.println(obj.indexOf("O")); //Gets the index of the character
		System.out.println(obj.concat("is Object")); //Concats the given string to the pre existing string
		System.out.println(obj.trim()); //Removes the white space from the string
		System.out.println(obj.substring(3,7)); // Prints the string from index[3] to index[7]
		System.out.println(obj.substring(3)); // Prints the string from index[3] to the string end
		System.out.println(obj.toUpperCase()); //Converts the string to upper case
		System.out.println(obj.toLowerCase()); //Converts the string to lower case
		
		String[] arr = obj.split("/"); //Splits the string based on the character mentioned in the split method
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(obj.replace("O", "J")); //Replaces the character

	}

}
