package demos.comm.service;

import java.util.List;

import demos.comm.domain.Board;

public interface BoardService {
	
	public void regist(Board board) throws Exception;
	
	public Board read(Integer bno) throws Exception;

	public void modify(Board board) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public List<Board> listAll(String searchOption, String keyword) throws Exception;
	
	public int countArticle(String searchOption, String keyword) throws Exception;
	
}
