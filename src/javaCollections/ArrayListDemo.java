package javaCollections;

import java.util.ArrayList;

//Arraylist can have duplicate values
//Arraylist have better methods than basic arrays which do not need iteration
//You need to mention type arguments for the Arraylist
//ArrayList grows dynamically
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sudesh");
		ar.add("Rahul");
		ar.add("Rahul");
		ar.add("Indra"); // Add elements in the ArrayList
		System.out.println(ar);
		ar.add(0, "Deepak");
		System.out.println(ar.size());
		
		System.out.println(ar.isEmpty()); //Boolean
		System.out.println(ar.contains("Deepak")); //Boolean
		System.out.println(ar.get(1));
		System.out.println(ar.indexOf("Rahul"));
		
		ar.remove("Indra");
		ar.remove(1);
		
		System.out.println(ar);	
	}

}
