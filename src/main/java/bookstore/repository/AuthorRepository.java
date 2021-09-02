package bookstore.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bookstore.model.Author;

public class AuthorRepository {
	

	public void save(Author author) {
		System.out.println("Salvando o autor " + author.getName());
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String user = "bookstore_user";
		String password = "senha";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			String saveAuthor = "insert into author(name, email, birth_date, mini_curriculum) "
											+ "values (?, ?, ?, ?)";
			PreparedStatement saveStatement = connection.prepareStatement(saveAuthor);
			connection.setAutoCommit(false);
			saveStatement.setString(1, author.getName());
			saveStatement.setString(2, author.getEmail());
			saveStatement.setDate(3, Date.valueOf(author.getBirthDate()));
			saveStatement.setString(4, author.getMiniCurriculum());
			saveStatement.execute();
			connection.commit();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
