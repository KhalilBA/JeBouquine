package tn.insat.jebouquine.web.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


public class ClientPageController {
	 
	 
	@RequestMapping(value="/customerOrders",method = RequestMethod.GET)
public String AccueilUser(Map<String, Object> model) {
	
    ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
    HttpSession session = attr.getRequest().getSession(true);
    
    if(session.getAttribute("userType")==null){
    	return "redirect:Connexion";
    }
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	OuvrageDAO ouvrageDAO = context.getBean(OuvrageDAO.class);
	
	List<Ouvrage> ListeOuvrage = (List<Ouvrage>) ouvrageDAO.findAll();
	
	model.put("ouvrages", ListeOuvrage);
	
	User connexionForm = new User();    
    model.put("findForm", connexionForm);
	
	return "User";
}