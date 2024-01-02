package New;

import java.util.Scanner;

public class PalidroneString {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String Org_str = str;
		String rev="";
		int it = str.length();
		for(int i=it-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}if(Org_str.equals(rev)) {
			System.out.println("palidroneString :" +Org_str);
		}else {
			System.out.println("notpalidroneString: "+Org_str);
		}

	}

}
