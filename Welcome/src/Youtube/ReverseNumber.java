package Youtube;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("number is :");
		int num =sc.nextInt();//1234
		
		//int rev=0;
		/*while(num!=0) {   //num!=0
			
			rev=rev*10+num%10; //0=0*10=0 + 1234%10=4,4*10=40 +3=43 430+2=432 ,4320+1=4321
			num=num/10; //1234/10=123,12,1
		}*/
		
	
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
			System.out.println("reversenum : "+rev);
	
			
		
		
		
		
	}

}
