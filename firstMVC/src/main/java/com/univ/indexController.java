package com.univ;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.univ.Model.emp;

@Controller
public class indexController {
	
	@RequestMapping("/ind")
	public String index()
	{
		return "header";
	}
	
	@RequestMapping("/index")
	public String index1()
	{
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/Registration")
	public String Registration()
	{
		return "Registration";
	}
	

	@RequestMapping("/")
	public String home(Model model)
	{
		System.out.println("Home Controller Working");
		model.addAttribute("name","Anikit kumar");
		model.addAttribute("id",1421);
		List<String> friends =new ArrayList<String>();
			friends.add("Vandan");
			friends.add("Roshni");
			friends.add("ABC");
			friends.add("Uttam");
			model.addAttribute("f",friends);
			
			return "index";
			
		}
	@RequestMapping("/marks")
	public ModelAndView mark(Model model) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Uttam Shukla");
		mv.addObject("rollnumber",123456);
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("time",now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(98);
		list.add(88);
		list.add(56);
		list.add(57);
		mv.addObject("marks",list);
		
		mv.setViewName("marks");
		return mv;
		
	}
	
	@RequestMapping(path="/Registration", method =RequestMethod.POST)
	public ModelAndView Registration(@ModelAttribute("Registration") emp Registration, Model model)
	{
		int x=0;
		ModelAndView mv=new ModelAndView();
		if(Registration.getEname().isBlank()) {
			mv.setViewName("redirect:/Registration");
		}
		else {
			x=1;
			
		}
		
		if(x>0)
		{
			System.out.println(Registration);
			mv.setViewName("login");
			
		}
		else {
			mv.setViewName("Registration");
		}
		return mv;
	}

}


