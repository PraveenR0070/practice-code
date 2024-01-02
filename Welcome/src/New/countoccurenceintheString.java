package New;

public class countoccurenceintheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "praveeeeeeeeeeen world world";
		int n =s.length();
		int m=s.replace("world", "").length();
		int Final=n-m;
		System.out.println(Final);
		
 }

}
