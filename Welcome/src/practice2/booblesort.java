package practice2;

import java.util.Arrays;

public class booblesort {

	public static void main(String[] args) {
		
		int a[]= {12,9,5,2,1,3,6};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int gen=a[j+1];
					a[j+1]=a[j];
					a[j]=gen;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
