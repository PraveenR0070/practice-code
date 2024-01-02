package prictice;

public class StringreverseWord {

	public static void main(String[] args) {
		String s="welcome to the java";
		String []st=s.split(" ");
		String reverseword=" ";
		for(String w:st) {
			String reversestring=" ";
			for(int i=w.length()-1;i>=0;i--) {
				reversestring=reversestring+w.charAt(i);
			}
			reverseword=reverseword+reversestring+" ";
		}
		System.out.println(reverseword);

	}

}
