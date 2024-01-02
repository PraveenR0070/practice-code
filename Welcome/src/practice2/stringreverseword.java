package practice2;

public class stringreverseword {

	public static void main(String[] args) {
		String s = "welcome to the java";
		String []st=s.split(" ");
		String reversestring="";
		for(String w:st) {
			String revereseword=" ";
			for(int i=w.length()-1;i>=0;i--) {
				revereseword=revereseword+w.charAt(i)+" ";
			}
			reversestring=reversestring+revereseword+" ";
		}

	}

}
