package demos.comm.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.comm.dao.MemberDAO;
import demos.comm.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	/*
	 * 추상화된 MemberService 인터페이스의 구현 클래스로 
	 * 실제 로그인 체크, 로그인 정보, 로그아웃의 비지니스 로직을 담는 곳
	 */
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean loginCheck(MemberVO member, HttpSession session) {
		boolean result = memberDao.loginCheck(member);
		if(result) {
			// 로그인이 체크되면 세션에 등록
			MemberVO vo2 = infoMember(member);
			// 세션 변수 등록 -- 세션 관련 학습필요
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
			session.setAttribute("userEmail", vo2.getUserEmail());
		}
		return result;
	}

	@Override
	public MemberVO infoMember(MemberVO member) {
		// 회원의 정보를 가져옴
		return memberDao.infoMember(member);
	}

	@Override
	public void logout(HttpSession session) {
		// 세션 정보를 초기화 시킴
		session.invalidate();
		
	}

}
