package tn.insat.jebouquine.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Auteurs")
public class Auteur implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="auteur_id", unique=true, nullable=false)
    private long id;
	
	private String nom;
	private String prenom ; 
	private String langue ; 
	private String genre ;
	
	public Auteur(){} ; 
	

	public Auteur(String nom, String prenom, String langue, String genre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.langue = langue;
		this.genre = genre;
	}



	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getLangue() {
		return langue;
	}




	public void setLangue(String langue) {
		this.langue = langue;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
	

}
