package tn.insat.jebouquine.service;

import java.io.Serializable;
import java.util.List;

import tn.insat.jebouquine.dataaccess.GenericDAO;
import tn.insat.jebouquine.dataaccess.GenericDAOImpl;
import tn.insat.jebouquine.domain.Auteur;
import tn.insat.jebouquine.domain.Commande;
import tn.insat.jebouquine.domain.Editeur;
import tn.insat.jebouquine.domain.Livre;

public class LivreService<T> extends GenericDAOImpl<T, Serializable> {

	public LivreService(Class<T> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
//	public LivreService(Class<Livre> entityClass) {
//	this.entityClass = entityClass;
//	}
//
//	GenericDAO<Livre, Long> dao = new GenericDAOImpl<Livre, Long>(Livre.class);
//	
//	
		
		
	}

