package postgresql_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
import java.sql.ResultSet;
import java.sql.Statement;
 */

public class ConnectDB {

	private String url;
	private String user;
	private String password;

	public ConnectDB(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public void connect() {
		try (Connection connection = DriverManager.getConnection(url, user, password);) {
			if (connection != null) {
				System.out.println("Connected.");
			} else {
				System.out.println("Failed to connect.");
			}
		} catch (SQLException error) {
			error.printStackTrace();
		}
	}

}
