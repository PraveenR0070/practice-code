import java.util.Arrays;

public class sort {

	public static void main(String[] args) {


		int a[]= {2,1,9,3,8,10};
		
	System.out.println("Befor sort:"+Arrays.toString(a));
	
	int list =a.length;
	for(int i=0;i<list-1;i++) {
		
		for(int j=0;j<list-1;j++) {
			
			if(a[j]>a[j+1]) {                 //2 >2+1
				int temp=a[j];            //2
				a[j]=a[j+1];                //2=2+1
				a[j+1]=temp;                //2+1 = 2
			}
		}
	}
	System.out.println("After sort:"+Arrays.toString(a));	

	}

}
