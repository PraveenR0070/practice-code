package Arry;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,2,4,9,7,6,10};
		System.out.println("befor sort:"+Arrays.toString(a));
		
		int d=a.length;
		for(int i=0;i<d-1;i++) {
			for(int j=0;j<d-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sort:"+Arrays.toString(a));
		

	}

}
