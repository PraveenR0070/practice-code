package Youtube;

public class Swaping {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("before sorting:"+a+" "+b);
		
		/*int c=a;
		a=b;
		b=c;*/
		a=a+b; //30
		b=a-b;  //10
		a=a-b;  //20
		
		
		
		
		System.out.println("after sorting:"+a+" "+b);

	}

}
