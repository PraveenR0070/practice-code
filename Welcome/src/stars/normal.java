package stars;

public class normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int count=0;
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}	
	}
	}


