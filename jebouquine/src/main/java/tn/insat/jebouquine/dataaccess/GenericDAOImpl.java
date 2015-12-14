package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

	protected Class<T> entityClass;
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public GenericDAOImpl() {
	    ParameterizedType genericSuperclass = (ParameterizedType) getClass()
	         .getGenericSuperclass();
	    this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
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
	 return this.entityManager.find(entityClass, id);
		
	}
	
	
	
	
	
	}