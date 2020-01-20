package ShapePackage;

public class Rectangle extends ShapeClass {
	int length,width;
	@Override
	public String toString() {
		return "Area of Rectangle: length=" + length + ", width=" + width + ", shapeId=" + shapeId + ", ShapeName=" + ShapeName;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle(int shapeId, String shapeName, int length, int width) {
		super(shapeId, shapeName);
		this.length=length;
		this.width=width;
		// TODO Auto-generated constructor stub
	}
	public int calculateArea(){
		return length*width;
	}

	
}
