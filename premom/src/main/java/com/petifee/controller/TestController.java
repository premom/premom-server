package com.petifee.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petifee.domain.UserVO;

@Controller
@RequestMapping("/test/")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("doA")
	public String doA(@ModelAttribute("msg") String msg, Model model){
		logger.info("doA가 호출되었습니다");
		return "bbb";
	}
	
	@RequestMapping("doB")
	public String doB(Model model){
		logger.info("doB가 호출되었습니다");
		model.addAttribute("msg", "테스트임");
		return "bbb";
	}
	
	@RequestMapping("getBean")
	public String getBean(Model model) {
		logger.info("getBean가 호출되었습니다");
		UserVO temp = new UserVO();
		temp.setUid("gondr");
		temp.setUpw("1234");
		temp.setUname("최선한");
		model.addAttribute("user", temp);
		return "bbb";
	}

	@RequestMapping("getJSON")
	public @ResponseBody UserVO getJSON(){
		UserVO temp = new UserVO();
		temp.setUid("gondr");
		temp.setUpw("1234");
		temp.setUname("최선한");
		
		return temp;
	}
}

