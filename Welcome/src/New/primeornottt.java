package New;

public class primeornottt {

	public static void main(String[] args) {
		
		int num=13;
		int count=0;
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					count++;
				}
				if(count==2) {
					System.out.println("prime");
				}else {
					System.out.println("notprime");
				}
			
			
		}else {
			System.out.println("notprimeno");
		}
		
		

	}

}
