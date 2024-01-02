package New;

public class Logic {
	
	
	public static void splitstring(String str) {
		
		StringBuffer alpha= new StringBuffer(),num=new StringBuffer(),special= new StringBuffer();
		
		for (int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			
			}else if (Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			
			}else {
				special.append(str.charAt(i));
			
			}	
		}
		System.out.print(alpha);
		System.out.print("  ");
		System.out.println( num);
		System.out.println(special);
		
	}
	
	public static void main(String[] args) {
		
		String str = "hjjdh2837738@#*$$&kd";
		
		splitstring(str);
	}

}
