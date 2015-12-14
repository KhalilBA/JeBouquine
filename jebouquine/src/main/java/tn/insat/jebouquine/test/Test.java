package tn.insat.jebouquine.test;
import java.util.ArrayList;
import java.util.List;

import tn.insat.jebouquine.dataaccess.GenericDAO;
import tn.insat.jebouquine.dataaccess.GenericDAOImpl;
import tn.insat.jebouquine.domain.Auteur;
import tn.insat.jebouquine.domain.Commande;
import tn.insat.jebouquine.domain.Editeur;
import tn.insat.jebouquine.domain.Livre;

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
		
		
		GenericDAO<Livre, Long> dao = new GenericDAOImpl<Livre, Long>(Livre.class);
		GenericDAO<Editeur, Long> dao2 = new GenericDAOImpl<Editeur, Long>(Editeur.class);
		GenericDAO<Auteur, Long> dao3 = new GenericDAOImpl<Auteur, Long>(Auteur.class);
		List<Commande> com =  new ArrayList<Commande>(); 
		List<Auteur> aut = new ArrayList<Auteur>();
		Auteur t =new Auteur("mourad", "mohsen", "francais", "thriller");
		aut.add(t);
		dao3.create(t);
		Editeur edit =new Editeur("poche", "khalil", "ff", "france", "gmail");
		dao2.create(edit);
		
		
		Livre l = new Livre("l'eventreur", "horreur",34,"jaque l'eventreur en queste ...", 45668889,"13/07/2001" ,com ,aut  ,edit);
				
				dao.create(l);
		
			
		System.out.println("Create1d ...");
		System.out.println("Fin du programme !");
		
	}

	
}



