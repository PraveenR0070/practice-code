package Strings;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5,6,7,9};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j] ) {
					int gen=a[i];
					a[i]=a[j];
					a[j]=gen;
				
				}
			}
		}
		System.out.println(a[1]);
		
	}

}
