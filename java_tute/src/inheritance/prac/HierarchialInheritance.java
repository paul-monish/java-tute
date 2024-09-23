package inheritance.prac;

class AAA{
	void show() {
		System.out.println("class A");
	}
}

class BBB extends AAA{
	void showB() {
		System.out.println("class B");
	}
}
class CC extends AAA{
	void showC() {
		System.out.println("class C");
	}
}
public class HierarchialInheritance {
	public static void main(String[] args) {
		CC c=new CC();
		c.show();
		c.showC();
		BBB b=new BBB();
		b.show();
		b.showB();
	}
}
