package TeaAPIJavalin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	//private Connection conn;
	
	public Connection createConnection() throws SQLException{                                     //?
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?", "postgres", "password");
		return conn;
	}
}


//jdbc:postgresql://localhost:5432/mydatabase?currentSchema=myschema
