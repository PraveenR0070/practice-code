package New;

import java.util.HashMap;
import java.util.Map;

public class Hashmapprint {

	public static void main(String[] args) {


		HashMap as = new HashMap();		
		//HashMap <Integer, String>as = new HashMap<Integer,String>();
			as.put(2,"raj");
			as.put(7,"mom");
			as.put(9,"shut");
			as.put(12,"dam");

		System.out.println(	as.keySet());
		System.out.println(	as.values());
		System.out.println(	as.entrySet());
		
		for(Object i : as.keySet()) {
			System.out.println(i);
		}
		for(Object i : as.values()) {
			System.out.println(i+" "+as.get(i));
		}
		
		//Entry interfecs method
		/*for(Map.Entry entry :as.entrySet()) {
			//System.out.println(entry);
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}*/
		
		
		
			

			}
		

	}


