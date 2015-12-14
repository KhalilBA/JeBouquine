package tn.insat.jebouquine.test;
import tn.insat.jebouquine.dataaccess.*;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

import tn.insat.jebouquine.domain.Auteur;
import tn.insat.jebouquine.domain.Client;

public class Test {

;
	public static void main(String[] args) {
		
		
		System.out.println("Illustration d'un DAO Hibernate simple");
		 
	
	
			
//		// Get the bean
//		GenericDAO repo = context.getBean(GenericDAO.class);
//		Auteur compte = new Auteur("victor","hugo","francais","arabe");
//		repo.create(compte);
//		AuteurRepository repo2 = context.getBean(AuteurRepository.class);
//		
//
//		// Use with the bean
//		repo.save(new Client("khalil","Ben Ahmed","rue des juges","gamil"));
//		repo2.save(new Auteur("victor", "hugo", "francais", "roman"));
//		List <Auteur> res2 = repo2.findByGenreLike("roman") ; 
//		for (Auteur auteur : res2) {
//			 System.out.println("=====================>"+auteur.getNom());
//			 }
//		
//		 List<Client> res = repo.findByNomLike("khalil");
//		 for (Client client : res) {
//		 System.out.println("=====================>"+client.getPrenom());
//		 }
////		
//		// Clean up
//		context.close();
		GenericDAO<Auteur, String> dao = new GenericDAOImpl<Auteur, String>(Auteur.class);
		Auteur auteur = new Auteur("victor","hugo","francais","arabe");
		dao.create(auteur);
		System.out.println("Created ...");
		System.out.println("Fin du programme !");
		
	}

	
}



