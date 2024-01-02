package Youtube;

public class sumofnumbersindigits {

	public static void main(String[] args) {
		
		int num=292838;
		
		int sum=0;
		while(num>0) {
		 sum =sum+num%10;  //8+3+8+2+9+2
		num=num/10;

	}
		System.out.println("sum of digits"+sum);
	}
	

	
}
