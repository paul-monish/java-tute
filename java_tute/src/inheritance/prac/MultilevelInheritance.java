package inheritance.prac;

class AA{
	 void showA() {
		System.out.println("In A");
	}
}
class BB extends AA{
	void showB() {
		System.out.println("In B");
	}
	void showA() {
		showA();
		System.out.println("In B TEST");
	}
}
class C extends BB{
	void showC() {
		showA();
		System.out.println("In C");
	}
}


public class MultilevelInheritance {
	public static void main(String[] args) {
		C c=new C();
//		c.showA();
//		c.showB();
		c.showC();
	}
}
