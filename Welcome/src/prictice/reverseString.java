package prictice;

public class reverseString {

	public static void main(String[] args) {

        
	    String str="madem";
		String rev=" ";
		int a=str.length();
		int count=0;
		for(int i=a-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			count++ ;
			System.out.println(rev+count);
			
		}
		
		System.out.println("reverser string is :"+rev );
		
	}
	
}
