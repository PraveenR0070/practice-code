package New;

public class revnum {

	public static void main(String[] args) {


		int num =122134;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;   //0,10+2=12,24
			num=num/10;   //1220/10=122 ,12
		}
		System.out.println(rev);//%

	}

}
