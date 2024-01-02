package Arry;

import java.util.Arrays;

public class second {

	public static void main(String[] args) {
		
		int a[]= {2,9,8,6,3,10,20,13};
		System.out.println("befor sort:"+Arrays.toString(a));
		/*int d=a.length;
		
		for(int i=0;i<d-1;i++) {
			for(int j=0;j<d-1;j++) {
				if(a[j]>a[j+1]) {
					int gen=a[j];
					a[j]=a[j+1];
					a[j+1]=gen;
				}
			}
		}
		System.out.println("After sort:"+Arrays.toString(a));*/
       Arrays.parallelSort(a);
       System.out.println("aftersort :"+Arrays.toString(a));
	}

}
