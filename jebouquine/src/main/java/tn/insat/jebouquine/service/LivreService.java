package tn.insat.jebouquine.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.jebouquine.dataaccess.LivreRepository;
import tn.insat.jebouquine.domain.Auteur;
import tn.insat.jebouquine.domain.Editeur;
import tn.insat.jebouquine.domain.Livre;

public class LivreService {

	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	// Start the factory
	
	public void create(String titre, String genre, int nb_page, String resume, int iSBN, String date_sortie)
	{// Get the bean
	LivreRepository repo = context.getBean(LivreRepository.class);

		Livre lv = new Livre(); 
		lv.setTitre(titre);
		lv.setGenre(genre);
		lv.setNb_page(nb_page);
		lv.setResume(resume);
		lv.setISBN(iSBN);
		lv.setDate_sortie(date_sortie);
		
		Set<Auteur> auteur_list = new HashSet<Auteur>();  
		Auteur auteur = new Auteur("victor","hugo","francais","roman");
		auteur_list.add(auteur);
		
		lv.setAuteurs(auteur_list);
		
		Editeur editeur = new Editeur("Robert", "francois", "commercial", "france", "yahoo");
	
		lv.setEditeur(editeur);
		repo.save(lv);
		List<Livre> resultat = repo.findAll();
		System.out.println(resultat.get(0));
		
		
	}
	
		public LivreService() {};
		
	}

