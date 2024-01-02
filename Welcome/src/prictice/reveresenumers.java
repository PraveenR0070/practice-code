package prictice;

public class reveresenumers {

	public static void main(String[] args) {
		int num=938736;
		System.out.println("orignum:"+num);
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reversenum:"+rev);

	}

}
