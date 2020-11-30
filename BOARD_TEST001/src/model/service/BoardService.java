package model.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dbcp.ConnectionHandler;
import model.Board;
import model.dao.BoardDao;
import util.Page;
import util.PageUtil;

public class BoardService {
	public boolean insertBoard(HttpServletRequest request) throws SQLException {
		boolean result = false;
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		Connection conn = ConnectionHandler.openConnection();
		
		int count = new BoardDao().insertBoard(conn,new Board(0,title,content,null));
		
		if (1 == count) {
			ConnectionHandler.commit(conn);
			result = true;
		} else {
			ConnectionHandler.rollback(conn);
		}
		return result;
	}
	public void selectBoard(HttpServletRequest request) throws SQLException {
		List<Board> boardList = new ArrayList();
		Board board = null;
		if(null != request.getParameter("seq")) {
			board = new Board(Integer.valueOf(request.getParameter("seq")),null,null,null);
		} else {
			board = new Board(0,null,null,null);
		}
		Connection conn = ConnectionHandler.openConnection();
		ResultSet rs = new BoardDao().selectBoard(conn,board);
		while (rs.next()) {
			boardList.add(new Board(
					rs.getInt("seq")
					,rs.getString("title")
					,rs.getString("content")
					,rs.getString("create_date")));
		}
		request.setAttribute("boardList", boardList);
		
		Page page = new Page();
		page.setTotlaCnt(new BoardDao().selectBoardCount(conn));
		new PageUtil().setPage(request, page);
	}
	
	
	
	
	
	
}
