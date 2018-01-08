package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Witaj na mojej pierwszej stronie!");
		model.addAttribute("tagline", "Najwspanialsza dziewczyna jest Amelcia :* ");
		
		return "welcome";
	}
}
