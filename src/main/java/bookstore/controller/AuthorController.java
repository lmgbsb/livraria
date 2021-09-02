package bookstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookstore.model.Author;
import bookstore.service.AuthorService;

@WebServlet("/author")
public class AuthorController extends HttpServlet{

	
	private AuthorService authorService;
	
	
	@Override
	public void init() throws ServletException {
		authorService = new AuthorService();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		
		Author author = authorService.build(request);
		authorService.save(author);
	}
}
