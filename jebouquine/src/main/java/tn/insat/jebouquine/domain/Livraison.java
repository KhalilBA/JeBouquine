package tn.insat.jebouquine.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Livraisons")
public class Livraison implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="livre_id", unique=true, nullable=false)
    private long id;
	private String description ; 
	private String date ; 
	
	
	@OneToOne(cascade=CascadeType.ALL)  
	@JoinColumn(name="commande_id")
	private Commande commande;
	
	public Livraison(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}; 
	
	
	

}
