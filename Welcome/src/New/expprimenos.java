package New;

public class expprimenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,j,count;
		
		for(i=2;i<=100;i++) {
			count = 0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
		
		
		
		

	}

}
