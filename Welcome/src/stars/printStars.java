package stars;

public class printStars {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("* ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

		for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		int count=1;
		for(int i=0;i<=5;i++) {
			
			for(int j=5;j>=0;j--) {
				System.out.print("* ");
				count++;
			}
			for(int k=0;k<i;k++) {
				System.out.print("  ");
				//count++;
			}
			
			System.out.println();
		}


	}

}
