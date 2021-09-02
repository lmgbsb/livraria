package bookstore.model;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Author {
	
	
	private String name;
	private String email;
	private LocalDate birthDate;
	private String miniCurriculum;
}
