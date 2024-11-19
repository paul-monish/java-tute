package ThreadPrac;

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
	},"Hii Thread");
		Thread t2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	},"Hello hread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		
		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}
