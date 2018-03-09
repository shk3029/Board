package demos.comm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demos.comm.domain.MemberVO;
import demos.comm.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/login")
	public void login(Model model) {	
		System.out.println(">>Login>>Controller");
		model.addAttribute("msg", "login");
	}
	
	@RequestMapping("/loginCheck")
	public String loginCehck(Model model, MemberVO member, HttpSession session) {
		System.out.println(">>LoginCheck>>Controller");
		boolean result = memberService.loginCheck(member, session);
		String view = null;
		if(result) {
			model.addAttribute("msg","success");
			view = "/main";
		} else {
			model.addAttribute("msg", "fail");
			view = "/member/login";
		}	
		return view;
	}
	
	@RequestMapping("/logout")
	public String logout(Model model, HttpSession session) {
		System.out.println(">>Loginout>>Controller");
		String view = "/member/login";
		memberService.logout(session);
		model.addAttribute("msg", "logout");
		return view;
	}
}
