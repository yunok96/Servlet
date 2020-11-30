package dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {
	public static Connection openConnection() throws SQLException {
		String jdbcDriver = "jdbc:apache:commons:dbcp:MYOWN";
		Connection conn = DriverManager.getConnection(jdbcDriver);
//		System.out.println(conn);
		conn.setAutoCommit(false);
		return conn;
	}
	public static void commit(Connection conn) throws SQLException {
		conn.commit();
		System.out.println("commit");
	}
	public static void rollback(Connection conn) throws SQLException {
		conn.rollback();
		System.out.println("rollback");
	}
}
