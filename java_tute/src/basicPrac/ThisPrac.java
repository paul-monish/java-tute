package basicPrac;
class ABC{
	int a;
	public ABC(int a){
		this.a=a;
	}
	void test() {
		System.out.print("test");
	}
	void show() {
		this.test();
		System.out.print(this.a);
	}
}
public class ThisPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new ABC(7);
		a.show();
	}

}
