package bookstore.factory;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import bookstore.model.Author;

public class AuthorFactory {
	

	public Author builAuthor(String name, String email, LocalDate birthDate, String miniCurriculum) {
		Author author = Author.builder()
				.name(name)
				.email(email)
				.birthDate(birthDate)
				.miniCurriculum(miniCurriculum)
				.build();	
		return author;
	}
	public Author build(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate = LocalDate.parse(request.getParameter("birthDate"), formatter);
		String miniCurriculum = request.getParameter("miniCurriculum");		
		return builAuthor(name, email, birthDate, miniCurriculum);
	}
	public List<Author> buildAll(List<Map<String, Object>> listaAutores){
		List<Author> autores = new ArrayList<>();
		for(Map<String, Object> mapAutor : listaAutores) {
			String name = (String)mapAutor.get("name");
			String email = (String)mapAutor.get("email");
			LocalDate birthDate = ((Date)mapAutor.get("birthDate")).toLocalDate();
			String miniCurriculum = (String)mapAutor.get("miniCurriculum");
			autores.add(builAuthor(name, email, birthDate, miniCurriculum));
		}		
		return autores;
	}
}
