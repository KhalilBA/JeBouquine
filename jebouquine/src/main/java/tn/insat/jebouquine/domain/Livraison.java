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
	
	@OneToOne
	Commande commande ; 

}
