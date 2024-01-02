package Strings;

public class Even {

	public static void main(String[] args) {
		
		int num = 1234569;
		int evencount=0;
		int oddcount=0;
		while(num>0) {      //1234569
			int rem = num%10; //1234569%10,=9
		if(rem%2==0) {
			
			evencount++;
			
		}else {
			oddcount++;
			
		}
		
		num=num/10;
			
		}
		System.out.println("evencount :"+evencount);
		System.out.println("oddcount :"+oddcount);

		
		}
}
