package model.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Board;
import util.Page;
import util.PageUtil;


public class BoardDao {
	public int insertBoard(Connection conn,Board board) throws SQLException {
		String sql = " insert into board (title,content) values (?,?) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		return pstmt.executeUpdate();
	}
	public int selectBoardCount(Connection conn) throws SQLException {
		int count = 0;
		String sql = " select count(*) as cnt from board ";
		System.out.println(sql);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery(sql);
		while(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}
	public ResultSet selectBoard(Connection conn,Board board) throws SQLException {
		String sql = " select * from board ";
		if (0 != board.getSeq()) {
			sql += " where seq = ?";
		}
		PreparedStatement pstmt = conn.prepareStatement(sql);
		if (0 != board.getSeq()) {
			pstmt.setInt(1, board.getSeq());
		}
		System.out.println(sql);
		return pstmt.executeQuery();
	}
//	public ResultSet selectBoard(Connection conn,Board board) throws SQLException { 실수 원본
//		String sql = " select * from board ";
//		if (0 != board.getSeq()) {
//			sql += " where seq = ? ";
//		}
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		if (0 != board.getSeq()) {
//			pstmt.setInt(1, board.getSeq());
//		}
//		pstmt = conn.prepareStatement(sql);
//		System.out.println(sql);
//		return pstmt.executeQuery();
//	}

}
