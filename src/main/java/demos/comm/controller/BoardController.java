package demos.comm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import demos.comm.domain.Board;
import demos.comm.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardservice;
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerGET(Board board, Model model, HttpSession session, RedirectAttributes rttr) throws Exception {
		logger.info("register get......");
		logger.info("session?" + session.getAttribute("userName"));
		if(session.getAttribute("userName") == null) {
			rttr.addFlashAttribute("needRegister", true);
			return "redirect:/member/login";
		} else {
			return "/board/register";
		}
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registPOST(Board board, RedirectAttributes rttr) throws Exception {
		
		logger.info("regist post....");
		logger.info(board.toString());
		
		boardservice.regist(board);

		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll")
	public void listAll(Model model, @RequestParam(defaultValue="title") String searchOption, @RequestParam(defaultValue="") String keyword) throws Exception {
		logger.info("show all list.............");
		logger.info("searchOption : "+ searchOption + ">>>>> keyword : " + keyword );
		List<Board> list = boardservice.listAll(searchOption, keyword);
	
		logger.info("listSize" + list.size());
		model.addAttribute("list", list);
		model.addAttribute("searchOption", searchOption);
		model.addAttribute("keyword", keyword);
	}
	
	@RequestMapping(value="/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute("boardVO", boardservice.read(bno));
	}
	
	@RequestMapping(value="/remove", method= RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
		boardservice.remove(bno);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		model.addAttribute(boardservice.read(bno));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(Board board, RedirectAttributes rttr) throws Exception {
		logger.info("mod post......");
		boardservice.modify(board);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}
}
