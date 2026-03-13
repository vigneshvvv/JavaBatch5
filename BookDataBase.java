package DataBaseConnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDataBase {
	
	String hostname = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password = "Vignesh333#";
	Connection connection;
	
	public void getBookDataFromDB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(hostname, user, password);
			Statement st = connection.createStatement();
			ResultSet result = st.executeQuery("select * from books");
			
			List<BooksData> booksDatas = new ArrayList<>();
			
			while(result.next()) {
				BooksData booksData = new BooksData();
				booksData.setId(result.getInt("id"));
				booksData.setBook_name(result.getString("book_name"));
				booksData.setAuthor(result.getString("author"));
				booksData.setPrice(result.getInt("price"));
				
				booksDatas.add(booksData);
			}
			System.out.println(booksDatas);
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
