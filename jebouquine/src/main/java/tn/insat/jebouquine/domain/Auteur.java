package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

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
	
	 @ManyToMany
	  @JoinTable(
	      name="Auteur_livre",
	      joinColumns=
	      	@JoinColumn(name="Auteur_ID", referencedColumnName="auteur_id"),
	      inverseJoinColumns=
	      	@JoinColumn(name="Livre_ID", referencedColumnName="livre_id"))
	  private List<Livre> livres;
	
	
	public Auteur()
	{} ; 
	
	

	public Auteur(String nom, String prenom, String langue, String genre, List<Livre> livres) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.langue = langue;
		this.genre = genre;
		this.livres = livres;
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
