package Youtube;

public class noofevenodd {

	public static void main(String[] args) {
		int num =29928;
		int evencount=0;
		int oddcount=0;
		while(num>0) {
			int rem=num%10;  //last num8, 
			
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			num =num/10;  ///one num removed
		}
		System.out.println(evencount+" "+oddcount);

	}

}
