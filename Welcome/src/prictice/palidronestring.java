package prictice;

import java.util.Scanner;

public class palidronestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc = new Scanner(System.in);
		     String str=sc.next();
		     String Org_str=str;
		     String rev="";
		     int len=str.length();
		     for(int i=len-1;i>=0;i--){
		         rev=rev+str.charAt(i);
		     }
		     if(Org_str.equals(rev)){
		         System.out.println("paliodrone : "+rev);
		     }else{
		         System.out.println("not paliodrone "+rev);
		     }

	}

}
