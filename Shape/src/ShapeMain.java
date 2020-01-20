
public class ShapeMain {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(101, "rectangle", 5, 5);
		System.out.println(r);
		System.out.println(r.area());
		Circle c=new Circle(102, "Circle", 2);
		System.out.println(c);
		System.out.println(c.area());
		Square s=new Square(103, "Square", 3);
		System.out.println(s);
		System.out.println(s.area());
		// TODO Auto-generated method stub

	}

}
