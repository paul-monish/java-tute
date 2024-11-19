package ThreadPrac;

class Hi1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Hello1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		Runnable o1=new Hi();
		Runnable o2=new Hello();
		
		Thread t1=new Thread(o1);
		Thread t2=new Thread(o2);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}
