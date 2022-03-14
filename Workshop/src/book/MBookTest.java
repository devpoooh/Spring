package book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MBookTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("book/book.xml");
		
		System.out.println("책이름\t가격\t\t할인율\t할인후금액");
		System.out.println("-------------------------------------------");
		Book book1 = ac.getBean("book1", Book.class);
		System.out.println(book1.toString());
		Book book2 = ac.getBean("book2",Book.class);
		System.out.println(book2.toString());
		Book book3 = ac.getBean("book3",Book.class);
		System.out.println(book3.toString());
	}

}