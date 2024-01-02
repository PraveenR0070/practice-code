package Youtube;

public class CountNumberofDigits {

	public static void main(String[] args) {


		int num=12349838;
		int count=0;
		while(num>0) {
			num=num/10;//1234,123,12,1
			count++;
			
		}
			System.out.println(count);
			
	

	}

}
