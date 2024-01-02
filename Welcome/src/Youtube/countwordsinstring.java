package Youtube;

public class countwordsinstring {

	public static void main(String[] args) {
		
		String s = "welcome to the java;";
		String []sc= s.split(" ");
		String reversestr="";
		for(String d:sc) {
			
			String reverseword="";
			for(int i=d.length()-1;i>=0;i--) {
				reverseword=reverseword+d.charAt(i);
				
			}
			reversestr=reversestr+reverseword+" ";
		}
		System.out.println(reversestr);
		
	}

}
