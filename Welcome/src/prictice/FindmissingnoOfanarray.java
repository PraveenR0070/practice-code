package prictice;

public class FindmissingnoOfanarray {

	public static void main(String[] args) {
		//
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
			
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i=1;i<=15;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		System.out.println("missing no is "+(sum2-sum1));
		
		//one number is print



	}

}
