package basicPrac;


public class ConstructorExec {
	
	static int  a=10;
	int b=15;
	public ConstructorExec() {
		System.out.println("called");
	}

	public static void main(String[] args) {
		int a=5;
		
		ConstructorExec ce1= new ConstructorExec();
		ConstructorExec ce2= new ConstructorExec();
//		int c=25;
		ce1.a=25;
		ce1.b=30;
		System.out.println(ce1.a);//25
		System.out.println(ce2.a);//25
		System.out.println(ce1.b);//30
		System.out.println(ce2.b);//15
//		System.out.println(c);
	}

}
