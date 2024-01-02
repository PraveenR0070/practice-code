package Arry;

public class Third {
	
	public static void main(String[] args) {
		
	
	int a[]= {3,7,8,6,10,20};
	
	int gen;
	for(int i=0;i<a.length;i++) {             //1
		for(int j=i+1;j<a.length;j++) {       //2
			if(a[i]<a[j]) {
				gen=a[i];
				a[i]=a[j];
				a[j]=gen;
				
			}
		}
	}
	System.out.println(a[1]);

}
}
