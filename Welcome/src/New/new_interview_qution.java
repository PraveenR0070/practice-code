package New;

public class new_interview_qution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="this is new world123 ";
		String[] s=str.split(" ");
		
		int count=0;
		for(String i:s) {
			if(i.equals("world123")) {
				count++; 
				System.out.println("count is :"+count);
			}
			
		}
		

	}

}
