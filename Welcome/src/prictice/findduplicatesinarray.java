package prictice;

public class findduplicatesinarray {

	public static void main(String[] args) {
		
		int a[]= {3,9,7,90,90,2,3,9};
		for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==a[j]) {
				System.out.print(a[i]+" ");
			}

	}
	}
}

}
