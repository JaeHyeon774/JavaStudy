package book;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
	public static void main(String[] args) {
		BookDTO[] book = new BookDTO[5];
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		book[0] = new BookDTO(21424, "Java Basic", "김하나", "Jaen.kr",15000, "Java 기본 문법");
		book[1] = new BookDTO(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000," ");
		book[2] = new BookDTO(55355, "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		book[3] = new BookDTO(35332, "Android App", "홍길동", "Jaen.kr", 25000, "Lighte Framework");
		book[4] = new BookDTO(35355, "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000, " ");
		
		for(int i = 0; i<book.length; i++) {list.add(book[i]);}
		
		book[0].toString(list);
	}
}
