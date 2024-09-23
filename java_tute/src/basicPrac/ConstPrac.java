package basicPrac;
import java.io.OutputStream;
import java.io.PrintStream;

class A1 {
	public A1() {
		System.out.print("hii");
	}

	public A1(int a) {
		System.out.print(a);
	}
	public A1(int a,int b) {
		System.out.print(a+b);
	}
	public void disp() {
		System.out.print("disp");
	}
}

class B1 extends A1{
	public B1() {
		super(5);
	}

	void show() {
		System.out.print("show B1");
	}
}



public class ConstPrac {

	public static void main(String[] args) {
		
		B1 a=new B1();
		
	}

}
