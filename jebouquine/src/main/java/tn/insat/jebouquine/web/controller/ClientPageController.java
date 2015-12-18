package tn.insat.jebouquine.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class ClientPageController {
	 
	 
	@RequestMapping(value="/customer-orders",method=RequestMethod.GET)
	public String redirect()
	{
		return("customer-orders");

	}
	
}