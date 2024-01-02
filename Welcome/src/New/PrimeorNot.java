package New;

public class PrimeorNot {

	public static void main(String[] args) {
		
		int num=97;
		int count=0;
		if(num>1) {
			
			for(int i=1;i<=num;i++) { ///1/0,1/0,2/0....
				if(num%i==0) 
					count++;
				}
				if(count==2) {
					System.out.println("primenumber");
				}
				else {
					System.out.println("not prime number");
				}
			}
		
			
		
		else {
			System.out.println("Not Prime Number");
		}
		

	}

}
