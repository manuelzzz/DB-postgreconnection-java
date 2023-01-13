package postgresql_connect;

public class Principal {

	public static void main(String[] args) {
		String url = "";
		String user = "";
		String password = "";

		/*
		url: your database url for entry with java (ex.: jdbc:postgresql://localhost/...)
		user: the user that matches with database (ex.: postgre)
		password: the passwor of user (ex.: POSTGRE)
		*/

		ConnectDB connection = new ConnectDB(url, user, password);

		connection.connect();
	}

}
