
public class Circle extends ShapeArea{
	int radious;
	@Override
	public String toString() {
		return "Circle [radious=" + radious + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	public int getRadious() {
		return radious;
	}
	public void setRadious(int radious) {
		this.radious = radious;
	}
	public Circle(int shapeId, String shapeName, int radious) {
		super(shapeId, shapeName);
		this.radious=radious;
		// TODO Auto-generated constructor stub
	}
	double area(){
		
		return 3.14*radious*radious;
	}

}
