package constructors;

public class defaul {
	
	
	public defaul() {
		System.out.println("new one ");
	}
	public defaul(String t) {
		System.out.println(t);
	}
	public static void main(String[] args) {
		
       defaul d = new defaul();
       System.out.println(d);
       defaul d1 = new defaul("new one prametrize");
       System.out.println(d1);
       
       
	}

}
