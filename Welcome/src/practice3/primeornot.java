package practice3;

public class primeornot {
	
	
	public static void main(String[] args) {
		
	
	int num = 3;
	int count=0;
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
				count++;
			}
			if(count==2) {
				System.out.println("prime numbers");
			}else {
				System.out.println("not a prime number");
			}
		
		
	}else {
		System.out.println("not a prime number");
	
	}
}
}
