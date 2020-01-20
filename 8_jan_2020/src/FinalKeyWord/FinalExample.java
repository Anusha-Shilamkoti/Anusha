package FinalKeyWord;

class A {
	final double pi = 3.14;

	void display() {
		System.out.println("Class A");
	}
}

class B extends A {
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.display();
		//A.pi=4.6; We cannot Assign the pi value because pi is final(Constant)
		System.out.println(b.pi);
	}

}
