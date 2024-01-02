package Strings;

public class Stringwithnum {

	public static void main(String[] args) {
		
		String s="priyanka";
		int count=0;
		int len=s.length();
		for(int i=0;i<=len-1;i++) {
			
			count++;
			System.out.println(s.charAt(i)+" "+count);
			if(i==4) {
				System.out.println("name");
			}
			
			
			//System.out.println(o);
		}

	}

}
