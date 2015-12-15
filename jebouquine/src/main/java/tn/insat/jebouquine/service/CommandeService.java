package tn.insat.jebouquine.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.jebouquine.dataaccess.CommandeRepository;
import tn.insat.jebouquine.dataaccess.LivreRepository;
import tn.insat.jebouquine.dataaccess.PanierRepository;
import tn.insat.jebouquine.domain.Commande;
import tn.insat.jebouquine.domain.Livre;
import tn.insat.jebouquine.domain.Panier;

public class CommandeService {
	
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	// Start the factory
	
	public void creat(String date,float totale )
	{
		// Get the bean
		CommandeRepository repo = context.getBean(CommandeRepository.class);
		PanierRepository repo2 = context.getBean(PanierRepository.class);
		LivreRepository repo3 = context.getBean(LivreRepository.class);
		Commande c = new Commande("13Decembre",1446);
		List<Livre> listlv = repo3.findAll();
		Set<Livre> set = new HashSet<Livre>(listlv);
		c.setLivres(set);
		List<Panier> lisp =repo2.findAll(); 
		
		c.setPanier(lisp.get(0));
		repo.save(c);
		
		
		
		
		
	}
	

}
