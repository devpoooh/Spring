package shape;

public class ShapeTest {
	public static void main(String[] args) {
		//Shape 객체 생성
		Shape shape[] = new Shape[6];
		
		shape[0]=new Triangle(7,5,"Blue");
		shape[1]=new Rectangle(4,6,"Blue");
		shape[2]=new Triangle(6,7,"Red");
		shape[3]=new Rectangle(8,3,"Red");
		shape[4]=new Triangle(9,8,"White");
		shape[5]=new Rectangle(5,7,"White");
		
		//기본정보 출력
		System.out.println("기본정보");
		for(Shape i:shape) {
			System.out.println(i.toString());
		}
		
		//5로 resize
		for(Shape i:shape) {
			i.setResize(5);
		}
		//사이즈 변경 후 정보
		System.out.println("\n사이즈를 변경 후 정보");
		for(Shape i:shape) {
			System.out.println(i.toString());
		}
	}
}
