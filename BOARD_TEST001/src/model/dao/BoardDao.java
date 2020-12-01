package model.dao;

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
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}
	public ResultSet selectBoard(Connection conn,Board board,Page page) throws SQLException {
		String sql = " select *,DATE_FORMAT(create_date,'%y.%m.%d') as c_date  from board ";
		if (0 != board.getSeq()) {
			sql += " where seq = ?";
		} else {
			sql += " order by seq desc limit ?, "+ PageUtil.PER_PAGE_CNT;
		}
		System.out.println(sql);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		if (0 != board.getSeq()) {
			pstmt.setInt(1, board.getSeq());
		} else {
			pstmt.setInt(1, (page.getPageNo()-1) * PageUtil.PER_PAGE_CNT);
		}
		return pstmt.executeQuery();
	}

}
