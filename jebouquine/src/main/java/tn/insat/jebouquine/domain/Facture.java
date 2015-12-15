package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Factures")

public class Facture implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    private long id;
	
	private Date date ; 
	private float TVA;
	private int remise ; 
	private float totalettc ;
	
	
	@OneToOne(cascade=CascadeType.ALL)  
	@JoinColumn(name="commande_id")
	private Commande commande;
	
	
	public Facture() {} ; 
	
	


	public Facture(Date date, float tVA, int remise, float totalettc) {
		super();
		this.date = date;
		TVA = tVA;
		this.remise = remise;
		this.totalettc = totalettc;
	}




	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public float getTVA() {
		return TVA;
	}


	public void setTVA(float tVA) {
		TVA = tVA;
	}


	public int getRemise() {
		return remise;
	}


	public void setRemise(int remise) {
		this.remise = remise;
	}


	public float getTotalettc() {
		return totalettc;
	}


	public void setTotalettc(float totalettc) {
		this.totalettc = totalettc;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public long getId() {
		return id;
	} 
	
	
	
}
