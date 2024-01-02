package Youtube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shuffelearray {

	public static void main(String[] args) {
		
		Integer []arr= {2,4,7,9,1,3,2};
		System.out.println(Arrays.asList(arr));
		List<Integer>list=Arrays.asList(arr);
		Collections.shuffle(list);
		System.out.println(Arrays.asList(arr));
	}

}
