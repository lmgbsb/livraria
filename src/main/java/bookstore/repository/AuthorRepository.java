package bookstore.repository;

import bookstore.model.Author;

public class AuthorRepository {

	public void save(Author author) {
		System.out.println("Salvando o autor " + author.getName());
	}
}
