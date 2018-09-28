package com.petifee.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petifee.domain.BoardVO;
import com.petifee.exception.ArticleNotFound;
import com.petifee.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService bs;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void registerGET() throws Exception{
		logger.info("글 등록 GET 요청입니다");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(BoardVO board, Model model, RedirectAttributes rttr) {
		logger.info("글 등록 POST 요청입니다");
		logger.info(board.toString());
		try {
			bs.regist(board);
		} catch(Exception e){
			e.printStackTrace();
			model.addAttribute("result", "fail");
			model.addAttribute("errorMsg", e.getMessage());
			return "/board/afterPost";
		}
		
		rttr.addFlashAttribute("result", "success");
		return "redirect:/board/list";
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		logger.info("모든 글 목록을 다 가져옵니다");
		
		model.addAttribute("list", bs.listAll()); 
	}
	
	@RequestMapping(value="/read/{bno}", method=RequestMethod.GET)
	public String read(@PathVariable("bno") int bno, Model model) throws Exception{
		try {
			BoardVO bo = bs.read(bno);
			String content = bo.getContent();
			content = content.replaceAll("\r\n", "<br/>"); //nl2br
			bo.setContent(content);
			model.addAttribute(bo);
			return "/board/read";
		} catch(Exception e) {
			throw new ArticleNotFound();
		}
	}
	

	@RequestMapping(value="/remove/{bno}", method=RequestMethod.GET)
	public String remove(@PathVariable("bno") int bno, RedirectAttributes rttr) 
			throws Exception{
		bs.remove(bno);
		rttr.addFlashAttribute("result", "success");
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/modify/{bno}", method = RequestMethod.GET)
	public String modifyGET(@PathVariable("bno") int bno, Model model) throws Exception {
		model.addAttribute(bs.read(bno)); //해당 글번호의 글을 읽어와서 모델에 넣어줌
		return "/board/modify";
	}

	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(BoardVO vo, RedirectAttributes rttr) throws Exception {
		bs.modify(vo);
		rttr.addFlashAttribute("msg", "success");
		
		return "redirect:/board/list";
	}
}
