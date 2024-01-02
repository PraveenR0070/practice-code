
public class second {
	
	public static void main(String[] args) {
		 
		int arry1[]= {2,3,9,7,5};
		int arry2[]= {30,40,20,30,20};
		
		int a=arry1.length;
		int b = arry2.length;
		int c=a+b;
		int c1[]=new int [c];	
		for(int i=0;i<a;i++) {
			c1[i]=arry1[i];
			
		}
		for(int i=0;i<b;i++) {
			c1[a+i]=arry2[i];
		}
		for(int i=0;i<c;i++) {
		System.out.println( c1[i]);
		}
		
	}

}
