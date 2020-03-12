package kr.co.portfoliio.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;





@Log
@Controller
@RequestMapping(value= "/admin")
public class AdminMaiinController {

	@GetMapping(value= {"","/"})
	public String MainPage() {
		log.info("Admin Main page");
		return "";
	}
}
