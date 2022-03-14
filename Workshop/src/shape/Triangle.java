package shape;

public class Triangle extends Shape implements Resize{
	Triangle() {
		super();
	}
	
	Triangle(int width, int height, String colors){
		super(width,height,colors);
	}

	public double getArea() {
		return (width*height)/2.0;
	}
	
	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}

	@Override
	public String toString() {
		return "Triangle\t" + getArea()+"\t"+colors;
	}
	
}
