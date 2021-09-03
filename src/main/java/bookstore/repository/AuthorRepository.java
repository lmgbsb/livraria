package bookstore.repository;

import java.util.List;
import java.util.Map;

import bookstore.dao.AuthorDAO;
import bookstore.factory.AuthorFactory;
import bookstore.model.Author;

public class AuthorRepository {
	
	
	private AuthorDAO authorDAO;
	private AuthorFactory authorFactory;
	
	
	public AuthorRepository() {
		this.authorDAO = new AuthorDAO();
		this.authorFactory = new AuthorFactory();
	}
	public void save(Author author) {
		authorDAO.save(author);
	}
	public List<Author> findAll() {
		List<Map<String, Object>> autores = authorDAO.findAll();
		return authorFactory.buildAll(autores);
	}
}
