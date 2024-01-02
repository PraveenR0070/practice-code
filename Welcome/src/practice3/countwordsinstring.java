package practice3;

public class countwordsinstring {

	public static void main(String[] args) {
        String s = "welcome to the java ";
        print(s);
        
	}
        
        
        public static void print(String s) {
        String[] st=s.split(" ");
        String revwords="";
        for(String w:st) {
        	String revword="";
        	for(int i=w.length()-1;i>=0;i--) {
        		revword=revword+w.charAt(i);
        	}
        	revwords=revwords+revword+" ";
        }
        System.out.println(revwords);

	}

}
