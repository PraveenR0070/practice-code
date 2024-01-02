package prictice;

public class countwordsinStringd {

	public static void main(String[] args) {
     String s= "Welcome to the java";
    String []sc = s.split(" ");
    String reverseString=" ";
    for(String w:sc) {
    	String revereseword="";
    	for(int i=w.length()-1;i>=0;i--) {
    		revereseword=revereseword+w.charAt(i);
    	}
    	reverseString=reverseString+revereseword+" ";
    }
    System.out.println(reverseString);
     
     

}

}
