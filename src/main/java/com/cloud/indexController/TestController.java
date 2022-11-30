package com.cloud.indexController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping
	public String name(Model m) {
		m.addAttribute("name", "Chetan");
		return "index.html";
	}
}
