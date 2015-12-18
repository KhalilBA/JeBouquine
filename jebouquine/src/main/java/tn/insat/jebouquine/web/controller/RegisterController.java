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
import tn.insat.jebouquine.service.ClientService;

@Controller
public class RegisterController {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	@RequestMapping(value = {"register"}, method = RequestMethod.GET)	
    public String ViewRegistration(Map<String, Object> model) {
		Client registerForm = new Client();    
        model.put("registerForm", registerForm);
        
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        
        if(session.getAttribute("userType")==null)
        	return "register";
       
        
        return "redirect:customerOrders";
	}
	
	
	
	@RequestMapping(value = "/customerOrders", method = RequestMethod.POST)
	public String SaveClient(@ModelAttribute("registerForm") Client client,
            Map<String, Object> model) {
		
		 ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	        HttpSession session = attr.getRequest().getSession(true);
	        
	 ClientService a=new ClientService();
	 a.create(client.getNom(),client.getPrenom(),client.getPassword(),client.getAdresse(), client.getEmail());

	session.setAttribute("userType", "client");
	session.setAttribute("client",a); 
	return "redirect:customerOrders";
	
	}
}
