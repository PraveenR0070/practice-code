package Arry;

public class ExtractFromarray {

	public static void main(String[] args) {

///even odd from array
		
		int a[]= {1,3,4,7,8,10};
		
		//extracting evenno
		System.out.println("evennumbers");
		for(int i=0;i<a.length;i++) { //value is 6 index is 5
		
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
		
		
		}
		System.out.println("oddnumbers");
		
		for(int i=0;i<a.length;i++) { //value is 6 index is 5
			
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
			
			
			}
		

	}

}
