package book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*
 * Book ������ ������ Ŭ������ �����ڿ� Encapsulation�� �����Ͽ� ���� isbn, title, author, publisher, pice, desc)
 * BookDTO Ŭ������ ������ �ִ� ������ ���ڿ��� ���Ͻ����ִ� toString()�� ����� �����ؼ� �ۼ�
 * BookDTO ��ü ������ BookTest Ŭ���� �ۼ�. BookTest ��� ȭ���� ������ ���� ��µǵ��� BookDTO Ŭ���� ��ü �����Ͽ� toString()�� ȣ���ϴ� main()�� �ۼ�*/

public class BookDTO {
	private int isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(int isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void show(ResultSet rs) {
		try {
			while(rs.next()) {
				System.out.println(rs.getInt("isbn") + "\t |"+rs.getString("title")+"\t |"+rs.getString("author")+
						"\t |"+rs.getString("publisher")+"\t |"+rs.getInt("price")+"\t |"+rs.getString("des"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void show(BookDTO dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.isbn + "\t |"+dto.title+"\t |"+
	dto.author+"\t |"+dto.publisher+"\t |"+dto.price+"\t |"+dto.desc);
	}
	
	public void show(List<BookDTO> list) {
		// TODO Auto-generated method stub
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).isbn + "\t |"+list.get(i).title+"\t |"+
		list.get(i).author+"\t |"+list.get(i).publisher+"\t |"+list.get(i).price+"\t |"+list.get(i).desc);
		}
	}
}
