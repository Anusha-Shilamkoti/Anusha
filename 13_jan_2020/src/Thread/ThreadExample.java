package Thread;

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is sub class");
	}
	System.out.println("Secound Statement");
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();
		mt.start();
		//mt1.start();
		System.out.println(mt.isAlive());
		System.out.println(mt.isDaemon());
		//mt.interrupt();
		//System.out.println(mt.isAlive());
		
	}

}
