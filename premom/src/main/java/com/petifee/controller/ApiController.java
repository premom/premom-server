package com.petifee.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petifee.domain.SeatVO;
import com.petifee.exception.ArticleNotFound;
import com.petifee.service.SeatService;

@Controller
@RequestMapping("/api")
public class ApiController {
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@Inject
	private SeatService ss;

	@RequestMapping(value = "seatAll", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getSeatAll(Model model) throws Exception{
		
		model.addAttribute("list", ss.listAll()); 
		
		List<SeatVO> list = ss.listAll();

//		List<SeatVO> list = new ArrayList<SeatVO>();
//		list.add(new SeatVO(1, 0));
//		list.add(new SeatVO(2, 1));
		
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("data", list);
		
		return res;
	}
	
	@RequestMapping(value = "seat/{car}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getSeat(@PathVariable("car") String car, Model model) throws Exception{
		
		model.addAttribute("list", ss.getSeat(car)); 
		
		List<SeatVO> list = ss.getSeat(car);

		
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("data", list);
		
		return res;
	}
	
	
	
	
}
