package kr.co.portfoliio.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;


@Log
@Controller
@RequestMapping(value="/admin/users")
public class AdminUserController {

	@GetMapping(value= {"", "/"})
	public String MainPage() {
		log.info("user Main page");
		return "";
	}
	
	@GetMapping(value="/signup")
	public String SignUpPage() {
		log.info("sign up page");
		return "";
	}
	
	@PostMapping(value="/signup")
	public String SignUpDo() {
		log.info("sign up do");
		return "";
	}
	
	@GetMapping(value="/profile")
	public String profilePage() {
		log.info("user Profile Page");
		return "";
	}
	
	
}
