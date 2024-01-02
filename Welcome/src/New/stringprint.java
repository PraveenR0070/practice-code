package New;

public class stringprint {

	public static void main(String[] args) {
		String str = "345hsnsAHF83&%*&%@$736hsbso0292773";
		
		String S1 = str.replaceAll("[^A-Za-z]", "");
		String S2 = str.replaceAll("[^0-9]", "");
		String S3 = str.replaceAll("[^&%*$@]", "");
		
		System.out.println( S1  +" "+  S2 +" "  +  S3 );
		

		
	}

}
