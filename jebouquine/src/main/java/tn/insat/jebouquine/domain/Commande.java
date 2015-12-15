package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Commandes")
public class Commande implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="commande_id", unique=true, nullable=false)
    private long id;
	
	private Date date ; 
	private float totale;
	
	
	@ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="commande_livre", joinColumns=
    @JoinColumn(name="commande_id"), inverseJoinColumns=
    @JoinColumn(name="livre_id"))  
	private Set<Livre> Livres;
	
	
	
	@OneToOne(mappedBy="commande") 
	Livraison livraison; 
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Panier_ID")
	private Panier panier;
	
	public Commande() {} ; 
	

	
	


	public Set<Livre> getLivres() {
		return Livres;
	}






	public void setLivres(Set<Livre> livres) {
		Livres = livres;
	}






	public Facture getFacture() {
		return facture;
	}






	public void setFacture(Facture facture) {
		this.facture = facture;
	}






	public Livraison getLivraison() {
		return livraison;
	}






	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}



	public Panier getPanier() {
		return panier;
	}




	public void setPanier(Panier panier) {
		this.panier = panier;
	}




	public void setId(long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getTotale() {
		return totale;
	}
	public void setTotale(float totale) {
		this.totale = totale;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	
	
	
	
}
