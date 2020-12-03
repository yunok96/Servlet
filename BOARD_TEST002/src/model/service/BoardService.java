package model.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dbcp.ConnectionHandler;
import model.dao.BoardDao;
import model.ori.Board;

public class BoardService {
	public boolean insertBoard(HttpServletRequest request) throws SQLException {
		boolean result = false;
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Connection conn = ConnectionHandler.openConnection();
		int count = new BoardDao().insertBoard(conn, new Board(0, title, content, null));
		if(1==count) {
			ConnectionHandler.commit(conn);
			result = true;
		} else {
			ConnectionHandler.rollback(conn);
		}
		return result;
	}
}
