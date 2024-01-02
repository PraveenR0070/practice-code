package New;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable {
	
	
	public static void main(String[] args) {
		
		Hashtable <Integer , String>at = new Hashtable<Integer , String>();
		
		at.put(2, "arun");
		at.put(3, "manuth");
		at.put(6, "arun");
		at.put(4, "nill");
		at.put(5, "put");
		
		System.out.println(at.keySet());///duplicate keys are not allowed
		System.out.println(at.values());//duplicate values are not allowed
		System.out.println(at.entrySet());
		
		for(Map.Entry entry :at.entrySet()) {
			System.out.println(entry);
		}
		
		
		System.out.println("********************************");
		
		
        HashMap<Integer , String> ap = new HashMap<Integer , String>();
		
		ap.put(2, "arun");
		ap.put(1, "manuth");
		ap.put(3, "arun");
		ap.put(4, "nill");
		ap.put(5, "put");
		
		
		
		System.out.println(ap.keySet());///duplicate keys are not allowed
		System.out.println(ap.values());//duplicate values are not allowed
		System.out.println(at.entrySet());//
		for(Map.Entry entry : ap.entrySet()) {
			System.out.println(entry);
			
		}
	}

}
