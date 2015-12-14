package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Editeurs")

public class Editeur implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    private long id;
	
	private String nom;
	private String fondateur ; 
	private String statue ; 
	private String siege ; 
	private String site_web ; 
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="editeur")
    private List<Livre> livres ;
	
	public Editeur() {}

	
	public Editeur(String nom, String fondateur, String statue, String siege, String site_web, List<Livre> livres) {
		super();
		this.nom = nom;
		this.fondateur = fondateur;
		this.statue = statue;
		this.siege = siege;
		this.site_web = site_web;
		this.livres = livres;
	}



	public Editeur(String nom, String fondateur, String statue, String siege, String site_web) {
		super();
		this.nom = nom;
		this.fondateur = fondateur;
		this.statue = statue;
		this.siege = siege;
		this.site_web = site_web;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFondateur() {
		return fondateur;
	}

	public void setFondateur(String fondateur) {
		this.fondateur = fondateur;
	}

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	public String getSiege() {
		return siege;
	}

	public void setSiege(String siege) {
		this.siege = siege;
	}

	public String getSite_web() {
		return site_web;
	}

	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}; 
	


}


