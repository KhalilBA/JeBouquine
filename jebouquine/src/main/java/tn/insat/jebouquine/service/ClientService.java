package tn.insat.jebouquine.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.jebouquine.dataaccess.ClientRepository;
import tn.insat.jebouquine.domain.Client;
import tn.insat.jebouquine.domain.Panier;

public class ClientService {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	// Start the factory
	
	public void create(String nom, String prenom, String adresse, String email)
	{// Get the bean
	ClientRepository repo = context.getBean(ClientRepository.class);
	Client client = new Client( nom,  prenom, adresse, email);
	Panier panier = new Panier();
	client.setPanier(panier);
	repo.save(client);
	

}
}
