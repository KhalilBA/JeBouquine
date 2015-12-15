package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.jebouquine.domain.Livre;


public class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

	protected Class<T> entityClass;
	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	//Start the factory
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	EntityManagerFactory emf=context.getBean("entityManagerFactory",EntityManagerFactory.class);
	// Create entity manager
	 EntityManager entityManager=emf.createEntityManager();
	
	 
	//Constructor
	public GenericDAOImpl(Class<T> entityClass ) {
		
		this.entityClass = entityClass;
	}
	
	public void create(T object_in) {
	    this.entityManager.persist(object_in);
	
	}
	
	
	
	public void update(T object_in) {
	  this.entityManager.merge(object_in);
	}
	
	
	public void delete(T object_in) {
		object_in = this.entityManager.merge(object_in);
	    this.entityManager.remove(object_in);
	}
	
	public T findByID(PK id) {
	 return this.entityManager.find(entityClass,id);
		
	}
	
	public List<T> findAll() {
        List<T> toExport = null;
    
        try {
            
            Query q = this.entityManager.createQuery("from " + entityClass.getSimpleName());
            toExport = (List<T>) q.list();
        } catch (Exception e) {
        	 
            e.printStackTrace();
        }
        return toExport;
    }
	
	
	
	}