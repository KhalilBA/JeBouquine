package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;

public interface GenericDAO<T, PK extends Serializable> {
	
	
	//CRUD 
	public abstract void create(T object_in);
	public abstract T findByID(PK id);
	public abstract void update(T object_in);
	public abstract void delete(T object_in);

}