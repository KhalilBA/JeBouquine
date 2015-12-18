package tn.insat.jebouquine.web.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import tn.insat.jebouquine.dataaccess.ClientRepository;
import tn.insat.jebouquine.domain.Client;

@Controller
public class HomeController {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 
	 
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
        Client connexionForm = new Client();    
        model.put("connexionForm", connexionForm);
        
        
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        
        if(session.getAttribute("userType")==null)
        	return "home";
       
        
        return "redirect:customerOrders";
        
    }
	
	
	@RequestMapping(value = {"/"}, method = RequestMethod.POST)	
    public String processRegistration(@ModelAttribute("connexionForm") Client client,
            Map<String, Object> model) {
   
		System.out.println(client);
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        ClientRepository repo = context.getBean(ClientRepository.class);  												 
    System.out.println(repo.findByEmailAndPassword(client.getNom(),client.getPassword()).size());
    	
		if(repo.findByEmailAndPassword(client.getEmail(),client.getPassword()).size()>0){
			session.setAttribute("userType", "client");
			session.setAttribute("client", repo.findByEmailAndPassword(client.getEmail(),client.getPassword()).get(0) );
			return "redirect:customerOrders" ;
		}
		model.put("err","L'E-mail et/ou le mot de passe saisie ne sont pas valide.");
		return "home";
         
        
    }
	
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.POST)	
    public String DisplayRegister() {
		
		return "redirect:register"; 
	}

	
}
	
	