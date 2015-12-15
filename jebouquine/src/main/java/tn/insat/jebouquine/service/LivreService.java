package tn.insat.jebouquine.service;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tn.insat.jebouquine.dataaccess.GenericDAO;
import tn.insat.jebouquine.dataaccess.GenericDAOImpl;
import tn.insat.jebouquine.domain.Auteur;
import tn.insat.jebouquine.domain.Commande;
import tn.insat.jebouquine.domain.Editeur;
import tn.insat.jebouquine.domain.Livre;

public class LivreService  {

	public void create(String titre, String genre, int nb_page, String resume, int iSBN, String date_sortie)
	{
		GenericDAO<Livre, String> dao = new GenericDAOImpl<Livre, String>(Livre.class);
		GenericDAO<Auteur, String> dao2 = new GenericDAOImpl<Auteur, String>(Auteur.class);
		GenericDAO<Editeur, String> dao3= new GenericDAOImpl<Editeur, String>(Editeur.class);
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
		dao3.create(editeur);
		lv.setEditeur(editeur);
		dao.create(lv);
		
		List<Livre> resultat = dao.findAll();
		System.out.println(resultat.get(0));
		
		
	}
	
		public LivreService() {};
		
	}

