package New;

import java.util.Scanner;

public class palidroneno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int Org_num=num;
		int Rev_num=0;
		while(num!=0){
			Rev_num = Rev_num*10+num%10;
			num = num/10;
			
			
		}if(Org_num==Rev_num) {
			System.out.println("palidrone nmber"+Org_num);
		}else {
			System.out.println("not palidrone number");
		}
		
		
		

	}

}
