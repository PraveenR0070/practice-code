package practice2;

import java.util.Scanner;

public class palidroneString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String org=str;
		String rev="";
		int n = str.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("palidroneString :"+rev);
		}
		else {
			System.out.println("notpalidrone string :"+rev);
		}

	}

}
