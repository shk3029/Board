package demos.comm.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import demos.comm.domain.Board;

@Controller
@RequestMapping("/study/*")
public class StudyController {
	private static final Logger logger = LoggerFactory.getLogger(StudyController.class);
	

	@RequestMapping(value="/notice")
	public String notice(Board board, Model model, HttpSession session, RedirectAttributes rttr) throws Exception {
		return "/study/notice";
	}
	
	@RequestMapping(value="/raffle")
	public String raffle(Board board, RedirectAttributes rttr) throws Exception {
		return "/study/raffle";
	}
}
