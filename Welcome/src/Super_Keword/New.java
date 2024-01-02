package Super_Keword;

public class New {

	String st;
	int a;
	public New(String st,int a){
		this.st=st;
		this.a=a;
		System.out.println("animal is created.....");
	}

	void eating() {
		System.out.println("eating....");	
	}
	
}

	class dog extends New{
		float sal;
		public dog(String st,int a,float sal) {
			super(st, a);
			this.sal=sal;
			System.out.println("dog is crated....");
			
		}
		

		void eating() {
			super.eating();
			System.out.println("dogeating....");
			
		}
		void display() {
			System.out.println(st+" "+a+" "+sal);
		}
		
	}
	








