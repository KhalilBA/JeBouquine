package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

	protected Class<T> entityClass;
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
	
	}