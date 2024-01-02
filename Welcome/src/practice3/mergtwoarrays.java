package practice3;

import java.util.Arrays;
import java.util.Collections;

public class mergtwoarrays {
	public static void main(String[] args) {
		int[] a= {2,3,5,4,7,6};
		int[] b= {12,16,17,100,13};
		Arrays.sort( a);
		Arrays.sort( b);
		printmerg(a,b);
		
		
	}
		
		public static void printmerg(int a[],int b[]) {
		int alength=a.length;
		int blength=b.length;
		int clenth = alength+blength;
		int[] c=new int[clenth];
		for(int i=0;i<=alength-1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<=blength-1;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<=clenth-1;i++) {
			
	        System.out.print(c[i]+" ");
	       
		}
		
		
		
		}
	}


