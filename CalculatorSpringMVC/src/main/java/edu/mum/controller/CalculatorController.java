package edu.mum.controller;

import edu.mum.domain.Calculator;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/calc2")
public class CalculatorController {

	@RequestMapping(method = RequestMethod.POST)
	public String calculate(Calculator calculator, RedirectAttributes redirectAttributes, Model model){
		calculator.setSum(calculator.getAdd1()+calculator.getAdd2());
		calculator.setProduct(calculator.getMult1()*calculator.getMult2());
		model.addAttribute(calculator);

		redirectAttributes.addFlashAttribute("calculator", calculator);
		return "redirect:/calc2/results";
	}

	@RequestMapping(value={"/results"}, method=RequestMethod.GET)
	public String displayResults(Model model){
		model.addAttribute("gmessage", "Thank you for using our calculator service.");
		return "result";
	}

}
