package java8.prowings.practice;

class MyThread extends Thread {

//	override run method of thread class
	public void run() {
		for(int i=1;i<=10;i++)
		{
			//executed by child thread
			System.out.println("child Thread");
		}
	}	
}

public class MyThreadDemo1 {
	
	public static void main(String[] args) {
		
		
		MyThread t = new MyThread();	//Thread instantiation
		
		t.start();	//start of thread 
		
		for(int i=1;i<=10;i++)
		{
			//executed by main thread
			System.out.println("main thread");
		}
	}
}
