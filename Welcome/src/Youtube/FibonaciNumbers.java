package Youtube;

public class FibonaciNumbers {

	public static void main(String[] args) {
		
		int n1=0,n2=1,sum=0;
		System.out.println(n1+" "+n2);
		for(int i=2;i<10;i++) {
		
		sum=n1+n2;//1,2,3,5
		System.out.print(" "+sum);//1,2,3,5
		
		n1=n2;//1,1,2
		n2=sum;//1,2,3   //we can add next presceding number
		
		}
	}

}
