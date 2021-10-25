package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		try {
			String password = System.getenv("DB_PASSWORD");
			String user = System.getenv("DB_USER");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_CAT", user, password);
		} catch (Exception e) {
			System.out.println("degla fsfs not");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
