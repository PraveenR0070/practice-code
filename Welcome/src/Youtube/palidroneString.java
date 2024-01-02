package Youtube;

import java.util.Scanner;

public class palidroneString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		String Org_str = str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		if(Org_str.equals(rev)) {
			System.out.println(Org_str+" "+"palidroneString");
		}else {
			System.out.println(Org_str+" "+"Not palidroneString");
		}
		

	}

}
