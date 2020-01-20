package ShapePackage;

public class ShapeClass {
	int shapeId;
	String ShapeName;

	@Override
	public String toString() {
		return "ShapeClass [shapeId=" + shapeId + ", ShapeName=" + ShapeName + "]";
	}

	public int getShapeId() {
		return shapeId;
	}

	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	public String getShapeName() {
		return ShapeName;
	}

	public void setShapeName(String shapeName) {
		ShapeName = shapeName;
	}

	public ShapeClass(int shapeId, String shapeName) {
		super();
		this.shapeId = shapeId;
		ShapeName = shapeName;
	}

	void displayShape(int id, String name) {
		shapeId = id;
		ShapeName = name;
		System.out.println("Shape "
				+ "Id: " + shapeId + "\nShape Name: " + ShapeName);
	}
}
