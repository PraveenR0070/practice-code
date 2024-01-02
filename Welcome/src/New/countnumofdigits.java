package New;

public class countnumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12239;
		//int numcount=0;
		int count=0;
		while(num>0) {
			//numcount=numcount+num%10;  //   0+9=9 , 1+3 =4 2+2=4,3+2=5,4+1=5
			num=num/10; //1223 122 12 1
			count++;
		}
		System.out.println(count);
	}

}
