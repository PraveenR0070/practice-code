package Arry;

public class duplicatevaluesinarry {

	public static void main(String[] args) {
		
		int a[]= {8,4,3,2,4,6,8,2,0,10,22};
		add(a);
		
		
		
	}
		public static void add(int a[]) {
		//Integer a = num.length;
		
		for(int i=0;i<=a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.print(a[i]);
		
			}
		}
		
		}
		}
}
	


