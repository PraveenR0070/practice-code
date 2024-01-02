package practice2;

public class countnoofvalues {

	public static void main(String[] args) {
		String s="praveen";
		int a =s.length();
		int count=0;
		int sum=0;
		for(int i=0;i<=a-1;i++) {
			sum=sum+s.charAt(i);
			count++;
		}
		System.out.println(count);

	}

}
