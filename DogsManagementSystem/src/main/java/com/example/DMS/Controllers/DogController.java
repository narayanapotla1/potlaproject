package com.example.DMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {
	
	@RequestMapping("dogHome")
	public String home() {
		return "home";
	}

}
