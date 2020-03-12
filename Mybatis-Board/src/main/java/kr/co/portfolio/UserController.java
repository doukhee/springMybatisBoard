package kr.co.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@GetMapping(value= {"","/"})
	public String Mainpage() {
		return "";
	}

	@GetMapping(value="/signup")
	public String SignUpPage() {
		return "";
	}
	
	@PostMapping(value="/signup")
	public String signupDo() {
		return "";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginPage() {
		return "";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String LoginDo() {
		return "";
	}
}
