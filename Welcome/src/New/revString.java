package New;

public class revString {

	public static void main(String[] args) {
		
		String str="madem";
		String rev="";
		int d=str.length();
		for(int i=d-1;i>=0;i--) {//5 ,4,3,2,1
		
			rev=rev+str.charAt(i);//m e d a m
			
		
		}
		
	
       System.out.println(rev);
	}

	
}
