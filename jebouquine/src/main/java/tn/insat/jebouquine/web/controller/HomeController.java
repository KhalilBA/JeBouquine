package tn.insat.jebouquine.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";}
		
		@RequestMapping(value="/basket",method=RequestMethod.GET)
		public String basket() {
			
			//traitement 
			
			return "basket";
			}
	
	
}
