package Thread;

class A{
	
}
class ThreadRun extends A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
	
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRun tr=new ThreadRun();
		Thread t=new Thread(tr);
		t.start();
	}

}
