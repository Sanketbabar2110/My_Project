package java8.prowings.practice;

class MyRunnable implements Runnable{

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread");		
		}
	}
}

public class MyThreadDemo2 {
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
		}
	}
}
