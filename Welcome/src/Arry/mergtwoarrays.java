package Arry;

public class mergtwoarrays {

	public static void main(String[] args) {


		int a[]= {2,3,4,9,2,1};
		int b[]= {3,9,10,20,2};
		int alength=a.length;
		int blength=b.length;
		int clength = alength+blength ;
		int c[]= new int[clength];
		for(int i=0;i<a.length;i++) {
		  c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+ " ");
		}
		

	}

}
