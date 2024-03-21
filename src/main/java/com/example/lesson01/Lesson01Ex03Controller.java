package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//jsp 화면 보내는 컨트롤러
@Controller // @ResponseBody 가 있으며면 안됨(@
public class Lesson01Ex03Controller {
	// http://localhost/lesson01/ex03
	
	@RequestMapping("/lesson01/ex03")
	public String ex03() {
		// return 되는 String은 jsp의 경로이다(@RespinseBody없을 때)
		//      /WEB-INF/jsp/lesson01/ex03.jsp
		// return "/WEB-INF/jsp/lesson01/ex03.jsp";
		return "lesson01/ex03";
	}
}
