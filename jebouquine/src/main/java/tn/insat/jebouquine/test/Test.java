package tn.insat.jebouquine.test;

import tn.insat.jebouquine.dataaccess.ClientRepository;
import tn.insat.jebouquine.service.ClientService;
import tn.insat.jebouquine.service.CommandeService;
import tn.insat.jebouquine.service.LivreService;

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
		
		
//		GenericDAO<Livre, Long> dao = new GenericDAOImpl<Livre, Long>(Livre.class);
//		GenericDAO<Editeur, Long> dao2 = new GenericDAOImpl<Editeur, Long>(Editeur.class);
//		GenericDAO<Auteur, Long> dao3 = new GenericDAOImpl<Auteur, Long>(Auteur.class);
//		List<Commande> com =  new ArrayList<Commande>(); 
//		List<Auteur> aut = new ArrayList<Auteur>();
//		Auteur t =new Auteur("mourad", "mohsen", "francais", "thriller");
//		aut.add(t);
//		dao3.create(t);
//		Editeur edit =new Editeur("poche", "khalil", "ff", "france", "gmail");
//		dao2.create(edit);
//		
//		
//		Livre l = new Livre("l'eventreur", "horreur",34,"jaque l'eventreur en queste ...", 45668889,"13/07/2001" ,com ,aut  ,edit);
//				
//				dao.create(l);
		
		ClientService cs =new ClientService();
		cs.create("amine", "boubaker","khalil", "bardo", "yahoo");
		
		//LivreService ls = new LivreService(); 
		//ls.create("la belle", "roman", 300, "il etait une fois", 3487899, "mardi13decembre");
		
		//CommandeService com = new CommandeService();
	//	com.creat("avril", 23455);
	
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Fin du programme !");
	}

	
}



