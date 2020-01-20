package ShapePackage;

class A{
	A(){
		super();
		System.out.println("Super");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Sub");
	}
}


public class SuperConstructor {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		// TODO Auto-generated method stub

	}

}
