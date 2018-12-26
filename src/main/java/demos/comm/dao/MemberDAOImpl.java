package demos.comm.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demos.comm.domain.Member;

@Component // 현재 클래스를 스프링에서 관리하는 dao bean으로 등록
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession session;
	
	private static String namespace = "member";
	
	@Override
	public boolean loginCheck(Member member) {
		// TODO Auto-generated method stub
		String name = session.selectOne(namespace+".loginCheck", member);
		return (name != null) ? true : false;
	}

	@Override
	public Member infoMember(Member member) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".infoMember", member);
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub	
		// 서비스단에서 세선 날리는 것으로 해결
	}
	
}
