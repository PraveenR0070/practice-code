package Youtube;

import java.util.Arrays;

public class baboolsort {

	public static void main(String[] args) {
		
		int a[]= {2,3,8,6,0,9};
		System.out.println("before sort:"+Arrays.toString(a));
		
		int l=a.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				
			}
			}
		}
		//System.out.println("before sort:"+Arrays.toString(a));
		String res=Arrays.toString(a);
		System.out.println("Aftersort : "+res);//[0, 2, 3, 6, 8, 9]
		
	}

}
