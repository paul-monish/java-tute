package InterfacePrac;

interface IFourth{
	void show();
	default void test() {
		System.out.println("Test");
	}
}
class Fourth implements IFourth{

	@Override
	public void show() {
		System.out.println("show");
		
	}
	
}

public class AdvInterface1 {
	public static void main(String[] args) {
		IFourth f=new Fourth();
		f.test();
		f.show();
	}
}
