package stars;

public class decresingpirmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=i;j<6;j++) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
