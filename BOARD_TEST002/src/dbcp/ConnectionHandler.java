package dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {
	public static Connection openConnection() throws SQLException {
		String jdbcDriver = "jdbc:apache:commons:dbcp:board2";
		Connection conn = DriverManager.getConnection(jdbcDriver);
		conn.setAutoCommit(false);
		return conn;
	}
	public static void commit(Connection conn) throws SQLException {
		conn.commit();
	}
	public static void rollback(Connection conn) throws SQLException {
		conn.rollback();
	}
}
