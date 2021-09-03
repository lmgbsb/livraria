<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Notting Hill</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div id="cadastro_autor">
				<form method="post" action="author">
					<table>
						<tr>
							<td align="right">
								Nome:
							</td>	
							<td>
								<input type="text" name="name">
							</td>						
						</tr>
						<tr>
							<td align="right">
								Email:
							</td>	
							<td>
								<input type="text" name="email">
							</td>						
						</tr>
						<tr>
							<td align="right">
								Data Nascimento:
							</td>	
							<td>
								<input type="text" name="birthDate">
							</td>						
						</tr>
						<tr>
							<td align="right">
								Mini Currículo:
							</td>	
							<td>
								<input type="text" name="miniCurriculum">
							</td>						
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="Cadastrar">
							</td>
						</tr>
						
					</table>
				</form>
			</div>
			<div id="lista_autores">
				<table>
					<tr>
						<th>
							Nome
						</th>
						<th>
							Email
						</th>
						<th>
							Data de Nascimento
						</th>
					</tr>
					<c:forEach var="author" items="${authors}">
						<tr>
							<td>${author.name}</td>
							<td>${author.email}</td>
							<td>${author.birthDate}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</body>
</html>