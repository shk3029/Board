package demos.comm.dao;

import java.util.List;

import demos.comm.domain.Board;

public interface BoardDAO {
	
	public void create(Board vo) throws Exception;
	
	public Board read(Integer bno) throws Exception;
	
	public void update(Board vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<Board> listAll(String searchOption, String keyword) throws Exception;
	
	public int countArticle(String searchOption, String keyword) throws Exception;
	
}
