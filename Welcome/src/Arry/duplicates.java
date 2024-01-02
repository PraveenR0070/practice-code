package Arry;

public class duplicates {

	public static void main(String[] args) {
		
		int a[]= {2,10,13,14,2,10,14};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
