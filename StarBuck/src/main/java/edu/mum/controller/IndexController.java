package edu.mum.controller;

import edu.mum.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController
{

	@ModelAttribute
	public User getUserObj(){
		return new User();
	}

	@RequestMapping()
	public String welcome(Model model) {
		return "index";
	}
}
