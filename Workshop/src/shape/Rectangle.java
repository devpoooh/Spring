package shape;

public class Rectangle extends Shape implements Resize {

	Rectangle(){
		super();
	}
	
	Rectangle(int width, int height, String colors){
		super(width,height,colors);
	}
	
	public double getArea() {
		return width*height;
	}
	
	@Override
	public void setResize(int size) {
		width+=size;
		
	}

	@Override
	public String toString() {
		return "Rectangle\t" + getArea() +"\t"+colors;
	}
}
