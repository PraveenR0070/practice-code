package New;

public class stars {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++,count++) {
				System.out.print(count);
			}
			System.out.println();
			
			
		}
		
		count=1;
		for (int i=0;i<=4;i++) {
			
			for(int j=4;j>i;j--) {
				System.out.print("");
				
			}
			
			for(int k=0;k<i;k++,count++) {
				
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
		
		

	}

}
