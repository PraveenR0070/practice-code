package Youtube;

import java.util.Scanner;

public class PalidroneNum {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int Org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(Org_num==rev) {
			System.out.println(Org_num +" "+"palidrone number ");
		}else {
			System.out.println(Org_num +"  "+"NOt palidrone number ");
		}
		

	}

}
