
public class ShapeArea {
	int shapeId;
	String shapeName;
	@Override
	public String toString() {
		return "ShapeArea [shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	
	public ShapeArea(int shapeId, String shapeName) {
		super();
		this.shapeId = shapeId;
		this.shapeName = shapeName;
	}
	
	public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	double area(){
		return 1.0;
	}
}
