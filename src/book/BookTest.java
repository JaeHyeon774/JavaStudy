package book;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
	public static void main(String[] args) {
		BookDTO[] book = new BookDTO[5];
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		book[0] = new BookDTO(21424, "Java Basic", "���ϳ�", "Jaen.kr",15000, "Java �⺻ ����");
		book[1] = new BookDTO(33455, "JDBC Pro", "��ö��", "Jaen.kr", 23000," ");
		book[2] = new BookDTO(55355, "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���");
		book[3] = new BookDTO(35332, "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lighte Framework");
		book[4] = new BookDTO(35355, "OOAD �м�, ����", "�ҳ���", "Jaen.kr", 30000, " ");
		
		for(int i = 0; i<book.length; i++) {list.add(book[i]);}
		
		book[0].toString(list);
	}
}
