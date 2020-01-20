package AbstractProject;


abstract class AbstractClass{
	abstract void add(int a, int b);
	
	void show(){
		System.out.println("This is a abstract class");
	}
}
class AbstractImpl extends AbstractClass{

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImpl a=new AbstractImpl();
		a.add(10, 20);
		a.show();
	}

}
