package demos.comm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demos.comm.domain.BoardVO;

@Component
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;
	
	private static String namespace = "demos.comm.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create",vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardVO bo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update",bo);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listAll");
	}
	

}
