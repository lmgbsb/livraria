package bookstore.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	
	private String url = "jdbc:mysql://localhost:3306/bookstore";
	private String user = "bookstore_user";
	private String password = "senha";
	private Connection connection;
	
	
	public Connection getConnection() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			System.out.println(e);
		}
		return connection;
	}
}
