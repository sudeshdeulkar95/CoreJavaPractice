package javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unused")
public class HashMapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "INDIA");
		hm.put(2, "CHINA");
		hm.put(3, "USA");
		hm.put(4, "UK");
		hm.put(5, "RUSSIA");
		hm.put(6, "NORWAY");
		hm.put(7, "NEPAL");
		
		System.out.println(hm.get(4));
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()){
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
