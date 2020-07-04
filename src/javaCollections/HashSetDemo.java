package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

//Does not accept duplicate values
//Does not store values in sequential order
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		hs.add("CHINA");
		hs.add("JAPAN");
		hs.add("RUSSIA");
		System.out.println(hs.contains("SUDESH"));
		
		System.out.println(hs.isEmpty());
		hs.remove("USA");
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next()); //The elements will be printed in random order
		}
	}

}
