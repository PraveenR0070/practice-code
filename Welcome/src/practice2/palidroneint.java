package practice2;

import java.util.Scanner;

public class palidroneint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int orgnum=num;
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(orgnum==rev) {
			System.out.println("palidrone num:"+rev);
		}else {
			System.out.println("not palidrone num:"+rev);
		}
		
		
		

	}

}
