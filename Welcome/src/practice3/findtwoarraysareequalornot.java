package practice3;

import java.util.Arrays;

public class findtwoarraysareequalornot {

	public static void main(String[] args) {
		int a[]= {2,4,6,7,9,10,11};
		int b[]= {2,4,6,7,9,10,11,12};
		boolean str =Arrays.equals(a, b);
		if(str==true) {
			System.out.println("arrays are equal");
		}else {
			System.out.println("arrays are not equal");
		}
		

	}

}
