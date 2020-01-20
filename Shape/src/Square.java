
public class Square extends ShapeArea {
	int side;
	@Override
	public String toString() {
		return "Square [side=" + side + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public Square(int shapeId, String shapeName, int side) {
		super(shapeId, shapeName);
		this.side=side;
		// TODO Auto-generated constructor stub
	}
	double area(){
		System.out.println(super.area());
		return 4*side;
	}

	
}