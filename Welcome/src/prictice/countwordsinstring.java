package prictice;

import java.io.InputStream;
import java.util.Scanner;

public class countwordsinstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num=sc.nextLine();
		int count=1;
		for(int i=0;i<num.length()-1;i++) {
			if((num.charAt(i)==' ' && num.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

	

}
