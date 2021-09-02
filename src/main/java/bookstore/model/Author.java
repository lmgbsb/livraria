package bookstore.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Author {
	
	
	private String name;
	private String email;
	private LocalDate birthDate;
	private String miniCurriculum;
}
