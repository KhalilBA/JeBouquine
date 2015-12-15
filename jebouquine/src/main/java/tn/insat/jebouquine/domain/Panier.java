package tn.insat.jebouquine.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Paniers")
public class Panier implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="livre_id", unique=true, nullable=false)
    private long id;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="panier")
    private List<Commande> commandes ;
	
	
	

}
