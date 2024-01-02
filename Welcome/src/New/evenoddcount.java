package New;

public class evenoddcount {

	public static void main(String[] args) {


		
		int num=938837;
		int evencount=0;
		int oddcount=0;
		while(num>0) { //938837  93883 9388 938 93 9 
			
			
			int rem=num%10;  //7  3 8 8 3 9
			if(rem%2==0) {   //7%2 !=0 !=0 =0 0 0 !=0 !=0
				evencount++;
				//1 2 
			}
			else {
				oddcount++; //1 2 3 4
				
			}
			num=num/10;//93883 9388 938 93 9 0
			
			
		}
		System.out.println("eve"+evencount);
		System.out.println("odd"+oddcount);

	}

}
