package new_practice;

public class countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="welcome to to to the java in to123 the string";
		//String s=sc.nextLine();
		String s[]=sc.split(" ");
		int len =sc.length();
		int count=0;
			for(String w:s) {
				if(w.equals("to")) {
					count++;
				}
			}
			System.out.println(count);
		}

	}


