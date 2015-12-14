package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.* ; 



@Entity
@Table(name="Livres")
public class Livre implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="livre_id", unique=true, nullable=false)
    private long id;
	
	private String titre;
	private String genre ; 
	private int nb_page ; 
	private String resume ;
	private int ISBN ; 
	private  String date_sortie ; 
	
	@ManyToMany(mappedBy="livres")
	  
	private List<Commande> commandes;
	
	@ManyToMany(mappedBy="livres")
	  private List<Auteur> auteurs;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Editeur_ID")
	private Editeur editeur;

	
	
	public Livre(){} ; 
	


	public Livre(String titre, String genre, int nb_page, String resume, int iSBN, String date_sortie,
			List<Commande> commandes, List<Auteur> auteurs, Editeur editeur) {
		super();
		this.titre = titre;
		this.genre = genre;
		this.nb_page = nb_page;
		this.resume = resume;
		ISBN = iSBN;
		this.date_sortie = date_sortie;
		this.commandes = commandes;
		this.auteurs = auteurs;
		this.editeur = editeur;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNb_page() {
		return nb_page;
	}

	public void setNb_page(int nb_page) {
		this.nb_page = nb_page;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}

	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}
	
	
}
