package New;

public class primenumbersdup {

	public static void main(String[] args) {
	
		int num =100;
	
		for(int i=2;i<=num;i++) {//23456
			int count=0;
			for(int j=2;j<i;j++) {//2<2 3<3,4<4
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
