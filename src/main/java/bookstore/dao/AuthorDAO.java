package bookstore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bookstore.factory.ConnectionFactory;
import bookstore.model.Author;

public class AuthorDAO {

	
	private ConnectionFactory connectionFactory;
	
	
	public AuthorDAO() {
		this.connectionFactory = new ConnectionFactory();
	}
	public void save(Author author) {
		try {
			Connection connection = connectionFactory.getConnection();
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
			connection.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> autores = new ArrayList<>();
		try {
			String findAllAuthors = "select * from author";
			Connection connection = connectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(findAllAuthors);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String, Object> autor = new HashMap<>();
				autor.put("name", rs.getString("name"));
				autor.put("email", rs.getString("email"));
				//autor.put("birthDate", rs.getDate("birth_date").toLocalDate());
				autor.put("birthDate", rs.getDate("birth_date"));
				autor.put("miniCurriculum", rs.getString("mini_curriculum"));
				autores.add(autor);
			}			
			connection.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return autores;
	}
}
