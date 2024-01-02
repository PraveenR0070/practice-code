package prictice;

import java.util.Arrays;
import java.util.Collections;

public class boubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,6,7,3,4};
		System.out.println("beforesort"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int gen=a[j];
					a[j]=a[j+1];
					a[j+1]=gen;
				}
				
			}
		}
		System.out.println("aftersort"+Arrays.toString(a));

	}

}
