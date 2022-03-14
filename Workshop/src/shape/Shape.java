package shape;

public class Shape {
	protected int width;
	protected int height;
	protected String colors;

	Shape() {

	}

	Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	// 도형의 넓이 리턴
	public double getArea() {
		return 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public void setResize(int i) {
		// TODO Auto-generated method stub
		
	}

}
