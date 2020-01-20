package ExamplePrograms;

abstract class Person {
	abstract void eat();
}

public class AnonymousInnerCLass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Person p = new Person() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Nice Food");

			}
		};
		p.eat();

	}

}
