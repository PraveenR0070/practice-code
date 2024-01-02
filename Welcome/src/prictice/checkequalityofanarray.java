package prictice;

//import java.sql.Array;
import java.util.Arrays;

public class checkequalityofanarray {

	public static void main(String[] args) {


		int a[]= {2,4,8,20,90,90};
		int b[]= {2,4,8,20,90,90,22};
		boolean ak= Arrays.equals(a,b);
		
		if(ak==true) {
			
		System.out.println("arrays are equal");
		
	}
		else {
			System.out.println("arrays are not equal");
			
		}
	}
}
