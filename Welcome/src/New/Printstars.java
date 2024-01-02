package New;

public class Printstars {
	
	
	public static void main(String[] args) {
		
		System.out.println("beforeprint");
		
		for (int i=0 ;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
	
	private void sysout() {
		// TODO Auto-generated method stub

	}
}
