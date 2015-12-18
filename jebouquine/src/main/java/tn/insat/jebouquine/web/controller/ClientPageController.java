package tn.insat.jebouquine.web.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Controller
public class ClientPageController {
	 
	 
	@RequestMapping(value="customerOrders",method = RequestMethod.GET)
	public String AccueilUser(Map<String, Object> model) {
		
		 ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	        HttpSession session = attr.getRequest().getSession(true);
	        
	        if(session.getAttribute("userType")==null){
	        	return "redirect:home";
	        }
	        
	        
	        
	    	return "customerOrders";
	    	
		}
	
	
   
}