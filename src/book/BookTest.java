package book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.Constant;

public class BookTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		try {
			Class.forName(Constant.DRIVER);
			con = DriverManager.getConnection(Constant.url,Constant.USER,Constant.PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql.append(" select isbn, title, author, publisher, price, des from library ");
		System.out.println("*********************** 도서 목록  ***********************");
		try {
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			BookDTO dto = new BookDTO();
			//보기 세개중 하나만 실행 시키기! rs값은 한칸씩 아래를향하므로 하나를 읽고나면 더이상 읽을 게 없어진다. 에러가 발생하지는 않음.
			//1. List 타입으로 전달
//			while(rs.next()) {
//				List<BookDTO> list = new ArrayList<BookDTO>();
//				dto.setIsbn(rs.getInt("isbn"));
//				dto.setTitle(rs.getString("title"));
//				dto.setAuthor(rs.getString("author"));
//				dto.setPublisher(rs.getString("publisher"));
//				dto.setPrice(rs.getInt("price"));
//				dto.setDesc(rs.getString("des"));
//				list.add(dto);
//				dto.show(list);
//			}
			//2. ResultSet 값을 전달.
			dto.show(rs);
			//3. dto 객체 전달.
//			while(rs.next()) {
//				dto.setIsbn(rs.getInt("isbn"));
//				dto.setTitle(rs.getString("title"));
//				dto.setAuthor(rs.getString("author"));
//				dto.setPublisher(rs.getString("publisher"));
//				dto.setPrice(rs.getInt("price"));
//				dto.setDesc(rs.getString("des"));
//				dto.show(dto);
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
