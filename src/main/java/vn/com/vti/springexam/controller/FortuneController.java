package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public String random(Model model) {
		Random rd = new Random();
		int number = rd.nextInt(3);
		
	String result ="";
	switch(number){
	case 0:
		result = "Lucky!";
		break;
	case 1:
		result = "Normal";
		break;
	case 2:
		result = "Bad!";
	}
	model.addAttribute("fortunejsp", result);
	return "fortune";
}
}


