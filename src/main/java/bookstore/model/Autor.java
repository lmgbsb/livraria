package bookstore.model;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Autor {
	
	
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String miniCurriculo;
}
