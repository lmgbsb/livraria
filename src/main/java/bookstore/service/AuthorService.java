package bookstore.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import bookstore.model.Author;
import bookstore.repository.AuthorRepository;

public class AuthorService {

	
	private AuthorRepository authorRepository;
	
	
	public AuthorService() {
		this.authorRepository = new AuthorRepository();
	}
	public void save(Author author) {
		authorRepository.save(author);
	}
	public Author build(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String birthDate = request.getParameter("birthDate");
		String miniCurriculum = request.getParameter("miniCurriculum");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		Author author = Author.builder()
								.name(name)
								.email(email)
								.birthDate(LocalDate.parse(birthDate, formatter))
								.miniCurriculum(miniCurriculum)
								.build();	
		return author;
	}
}
