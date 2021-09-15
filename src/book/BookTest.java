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
		System.out.println("*********************** ���� ���  ***********************");
		try {
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			BookDTO dto = new BookDTO();
			//���� ������ �ϳ��� ���� ��Ű��! rs���� ��ĭ�� �Ʒ������ϹǷ� �ϳ��� �а��� ���̻� ���� �� ��������. ������ �߻������� ����.
			//1. List Ÿ������ ����
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
			//2. ResultSet ���� ����.
			dto.show(rs);
			//3. dto ��ü ����.
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
