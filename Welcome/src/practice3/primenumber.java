package practice3;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=30;
		
			for(int i=2;i<=num;i++) {
				int count=0;
				for(int j=2;j<num;j++) {
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


