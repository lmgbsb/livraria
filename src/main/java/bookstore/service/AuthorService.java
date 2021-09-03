package bookstore.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import bookstore.factory.AuthorFactory;
import bookstore.model.Author;
import bookstore.repository.AuthorRepository;

public class AuthorService {

	
	private AuthorRepository authorRepository;
	private AuthorFactory authorFactory;
	
	
	public AuthorService() {
		this.authorRepository = new AuthorRepository();
		this.authorFactory = new AuthorFactory();
	}
	public void save(Author author) {
		authorRepository.save(author);
	}	
	public List<Author> findAll(){
		return authorRepository.findAll();
	}
	public Author build(HttpServletRequest request) {
		return authorFactory.build(request);
	}	
	public void save(HttpServletRequest request) {
		save(authorFactory.build(request));
	}	
}
