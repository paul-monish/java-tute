package InterfacePrac;

/*
 * single method interface-(Functional Interface)
 * multiple method interface
 * marker interface
 */

//functional interface
interface IFirst {
	int a = 1;
	void disp();
}

//multiple method interface
interface ISecond{
	void show();
	void show1();
	void show2();
}
//marker interface
interface IThird{
	
}
class First implements IFirst,ISecond,IThird {

	public void disp() {
		System.out.println("In First");
	}

	@Override
	public void show() {
		System.out.println("In Second1");
		
	}

	@Override
	public void show1() {
		System.out.println("In Second2");		
	}

	@Override
	public void show2() {
		System.out.println("In Second3");		
	}
}

public class Interface1 {
	public static void main(String[] args) {
//		IFirst f=new First();
		First f=new First();
//		System.out.println(IFirst.a);
		f.disp();
		f.show();
		f.show1();
		f.show2();
		
		
	}
}
