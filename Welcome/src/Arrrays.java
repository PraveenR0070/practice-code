
public class Arrrays {
	
	
	public static void main(String[] args) {
		
		int arry1[]= {1,2,5,7,3};
		int arry2[]= {9,3,20,30,20};
		
		int a = arry1.length;
		int b = arry2.length;
		int c=a+b;
		int[]cl = new int[c];
		
		for(int i=0;i<a;i++) {
		      cl[i]= arry1[i];
		}
		for(int i=0;i<b;i++) {
		      cl[a+i]= arry2[i];
		}
		for(int i=0;i<c;i++) {
		      System.out.print(cl[i]);
		}
	}
	

	}


