package Super_Keword;

public class Parent_cls {

	String color = "white";

}

	
 class child extends Parent_cls {
	 
	 String color ="green";
	 void printcolor() {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
 
 	 
	public static void main(String[] args) {
		child ch = new child();
		ch.printcolor();
	}
	}

