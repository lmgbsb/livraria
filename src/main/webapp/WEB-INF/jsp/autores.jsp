<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autores</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2 class="text-center">Cadastro de Autor</h2>
		<form method="post" action="author">
			<div class="form-group">
				<label>Nome:</label>
				<input name="name" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Email:</label>
				<input name="email" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Data de Nascimento:</label>
				<input name="birthDate" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Mini Currículo:</label>
				<input name="miniCurriculum" class="form-control">
			</div>
						
			<input type="submit" value="Salvar" class="btn btn-primary mt-1">
		</form>
		
		<h2 class="text-center">Lista de Autores</h2>
	
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Email</th>
					<th>Data de Nascimento</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="author" items="${authors}">
					<tr>
						<td>${author.name}</td>
						<td>${author.email}</td>
						<td>${author.birthDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>