package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Board;

public class BoardDao {
	public int insertBoard(Connection conn, Board board) throws SQLException {
		String sql = "insert into myown.board (title,content) values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		return pstmt.executeUpdate();
	}

}
