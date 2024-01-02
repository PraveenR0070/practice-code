package Youtube;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("reverese strng :");
		String str = sc.next();
		String rev="";
		//int count=0;
		int c=str.length();
		for(int i=c-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			//count++;
		}
	/*char a[]=str.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--) {
		rev=rev+a[i];
		
	}*/
		
		
		System.out.println("After Reverse :"+rev);
		

	}

}
