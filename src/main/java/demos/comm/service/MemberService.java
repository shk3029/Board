package demos.comm.service;

import javax.servlet.http.HttpSession;

import demos.comm.domain.MemberVO;

public interface MemberService {
	/*
	 * 1. 로그인 체크
	 * 2. 로그인 정보
	 * 3. 로그아웃
	 */
	public boolean loginCheck(MemberVO member, HttpSession session);
	public MemberVO infoMember(MemberVO member);
	public void logout(HttpSession sesion);
}
