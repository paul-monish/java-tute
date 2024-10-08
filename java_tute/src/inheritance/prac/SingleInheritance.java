package inheritance.prac;

//single inheritance
class A {
	int a = 5;
	private int c=7;
	void showA() {
		System.out.println("Value= " + a);
	}
	
	public int getVal() {
		return c;
	}
}

class B extends A {
	int a = 6;

	void showB() {	
		this.a=this.a+super.a;
		System.out.println("Value= " + this.a);
	}
	void showA() {
		super.showA();
		System.out.println("In class B");
	}
	public int getVal() {
		return this.a;
	}
	void calc() {
		int mult=this.a*super.getVal();
		System.out.println(mult);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		B b = new B();
//		b.showB();
//		b.showA();
		b.calc();
	}
}
