package demos.comm.dao;

import javax.servlet.http.HttpSession;

import demos.comm.domain.Member;

public interface MemberDAO {
	// 회원 로그인 체크
	public boolean loginCheck(Member member);
	// 회원 로그인 정보
	public Member infoMember(Member member);
	// 회원 로그아웃
	public void logout(HttpSession session);
}
