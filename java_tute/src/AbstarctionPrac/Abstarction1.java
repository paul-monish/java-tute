package AbstarctionPrac;
abstract class ABS{
	abstract void show();
	public void des() {
		System.out.println("In ABS");
	}
}

class ABSI extends ABS{
	public void show() {
		System.out.println("In A");
	}
}

public class Abstarction1 {
	public static void main(String[] args) {
		ABS abs=new ABSI();
		abs.des();
		abs.show();
	}
}
