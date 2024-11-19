package ThreadPrac;

class Counter{
	int count;
	public synchronized void increment() {
		count++;//count=count+1
	}
	@Override
	public String toString() {	
		return "Count: "+this.count;
	}
}

public class SynchronizationExample {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		
		Thread t1=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		System.out.println("Count: "+c.count);

	}

}
