package demos.comm.dao;

import javax.servlet.http.HttpSession;

import demos.comm.domain.MemberVO;

public interface MemberDAO {
	// 회원 로그인 체크
	public boolean loginCheck(MemberVO member);
	// 회원 로그인 정보
	public MemberVO infoMember(MemberVO member);
	// 회원 로그아웃
	public void logout(HttpSession session);
}
