package New;

public class PrimeNums {

	public static void main(String[] args) {
		
		int num =100;
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
				count++;
				break;
			}
			if(count==0) {
				System.out.println(i);
			}
		}

	}
	}




