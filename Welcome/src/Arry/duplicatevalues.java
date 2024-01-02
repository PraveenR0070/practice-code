package Arry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicatevalues {

	public static void main(String[] args) {
	
		
		int a[]= {3,8,3,9,2,8};
		/*boolean flag=true;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;i<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate"+a[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false) {
			System.out.println("not duplicate");
			
		}*/
		
		//===============================
		Set<Integer> store= new HashSet<Integer>();
		for(int i:a) {
			if(store.add(i)==false) {
				System.out.println(i);
			}
		}

	}

}
