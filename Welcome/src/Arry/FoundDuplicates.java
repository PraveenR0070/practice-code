package Arry;

import java.util.HashSet;
import java.util.Set;

public class FoundDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,6,9,2,4,8};
		
		//int d=a.length;
		
		Set<Integer> s = new HashSet<Integer>();
		boolean flag = false;
		for(int i : a) {
			if(s.add(i)==false) {
				System.out.println(i);
				 flag =true;
			}
		}
		if(flag==false) {
			System.out.println("not duplicate");
		}
		
		
	}

}
