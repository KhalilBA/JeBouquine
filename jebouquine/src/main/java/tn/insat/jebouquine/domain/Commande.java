package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="Client_ID")
	  private Client client;
	
	@OneToOne @MapsId
    Facture facture;
	
 
	
	@ManyToMany
	  @JoinTable(
	      name="commande_livre",
	      joinColumns=
	      	@JoinColumn(name="Commande_ID",nullable=true, updatable=true),
	      inverseJoinColumns=
	      	@JoinColumn(name="Livre_ID", nullable=true, updatable=true))
	  private List<Livre> livres;
	
	
	@OneToOne(mappedBy="commande") 
	Livraison livraison; 
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Panier_ID")
	private Panier panier;
	
	public Commande() {} ; 
	

	
	
	
	
	public Commande(Date date, float totale, Client client, Facture facture, List<Livre> livres) {
		super();
		this.date = date;
		this.totale = totale;
		this.client = client;
		this.facture = facture;
		this.livres = livres;
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
