package practice3;

import java.util.Arrays;

public class bobblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,10,1,22,12,33,14};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int gen=a[j];
					a[j]=a[j+1];
					a[j+1]=gen;
					
				}
			}
			
			
		}
		System.out.println(Arrays.toString(a));

	}

}
