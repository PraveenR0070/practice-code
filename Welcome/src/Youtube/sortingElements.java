package Youtube;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortingElements {

	public static void main(String[] args) {


		//int a[]= {9,8,10,25,2,1,0,4};
		
		/*System.out.println("ArrayElements beforesort :"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		Arrays.sort(a);
		System.out.println("AfterSort :"+Arrays.toString(a));*/
		
		//Reverese or desendingOredr
		Integer a[]= {9,8,10,25,2,1,0,4};
		System.out.println("ArrayElements beforesort :"+Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("AfterSort :"+Arrays.toString(a));
	}

}
