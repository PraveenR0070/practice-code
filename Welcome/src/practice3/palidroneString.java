package practice3;

import java.util.Scanner;

public class palidroneString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String OrgStr=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(OrgStr.equals(rev)) {
			System.out.println("palidrone String: "+rev);
		}else {
			System.out.println("not palidrone string : "+rev);
		}
		
	}

}
