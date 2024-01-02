package Strings;

public class Stringintspl {

	public static void main(String[] args) {


		String s = "praveen";
		String a ="p r a v e e n87*&";
		int count=0;
		String st = a.replaceAll("[^A-Za-z]", ""+count++);
		String i = s.replaceAll("[^0-9]", "");
		String sp = s.replaceAll("[^*%&]", "");
		System.out.println(st +" "+i+" "+sp+count);

	}

}
