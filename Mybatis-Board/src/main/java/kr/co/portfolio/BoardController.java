package kr.co.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping(value="/boards")
public class BoardController {

	@GetMapping(value= {"","/"})
	public String Mainpage() {
		return "";
	}
}
