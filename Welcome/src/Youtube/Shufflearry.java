package Youtube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shufflearry {

	public static void main(String[] args) {
		
		
		Integer[] arr= {2,4,5,6,2,3};
		Integer[] arr1= {2,4,5,6,2,3,4};
		
		List<Integer>list=Arrays.asList(arr);
		Collections.shuffle(list);
		System.out.println(Arrays.toString(arr));
		
		//Collections.addAll(arr,arr1 );

	}
	
}
