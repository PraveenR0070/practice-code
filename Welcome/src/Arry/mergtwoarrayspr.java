package Arry;

import java.util.Arrays;

//import java.lang.reflect.Array;

public class mergtwoarrayspr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,6,4,9,7,9};
		int b[]= {3,7,1,0,2,6,2};
		 int alength =a.length;
		 Arrays.parallelSort(a);
		 int blength=b.length;
		// Arrays.parallelSort(b);
		 int clength = alength+blength;
		 int[] c=new int [clength];
		// Arrays.parallelSort(c);
		 //System.out.println(c);
		 for(int i=0;i<alength;i++) {
			 c[i]=a[i];
			 
		 }
		 for(int i=0;i<blength;i++) {
			 c[a.length+i]=b[i];
		 }
		 for(int i=0;i<clength;i++) {
			 
			 int k=c[i];
			System.out.print(k+ " ");
			
			 
			
			
		 }
		
		
		

	}

}
