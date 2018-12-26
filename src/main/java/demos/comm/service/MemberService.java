package demos.comm.service;

import javax.servlet.http.HttpSession;

import demos.comm.domain.Member;

public interface MemberService {
	/*
	 * 1. 로그인 체크
	 * 2. 로그인 정보
	 * 3. 로그아웃
	 */
	public boolean loginCheck(Member member, HttpSession session);
	public Member infoMember(Member member);
	public void logout(HttpSession sesion);
}
