package com.pp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	@GetMapping("/")
	public String Home(){
		
		return "index.html";
	}
}
