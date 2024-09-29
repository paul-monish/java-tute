package AbstarctionPrac;
abstract class ABS{
	abstract void show();
	abstract void show1();
	public void des() {
		System.out.println("In ABS");
	}
	public void des1() {
		System.out.println("In ABS des1");
	}
}

class ABSI extends ABS{
	public void show() {
		System.out.println("In A");
	}
	public void des() {
		super.des();
		System.out.println("In ABSI");
	}
	
	void show1() {
		System.out.println("In A show1");		
	}
}

public class Abstarction1 {
	public static void main(String[] args) {
		ABS abs=new ABSI();
		abs.des();
		abs.show();
		abs.show1();
		abs.des1();
	}
}
