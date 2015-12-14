package tn.insat.jebouquine.domain;



import java.io.Serializable;
import java.util.List;
import javax.persistence.*;



	@Entity
	@Table(name="Clients")
	public class Client implements Serializable {
		
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@SequenceGenerator(name="pk_sequence",sequenceName="messagesounds_id_seq", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	    private long id;
		
		private String nom;
		private String prenom ; 
		private String adresse ; 
		private String email ; 
		
		@OneToMany(targetEntity=Commande.class,mappedBy="client")
	    List<Commande> commandes ;
		
		@OneToOne(mappedBy="client")  
		Panier panier ;
		
		
		public Client()
		{}
		
		
		



		public Client(String nom, String prenom, String adresse, String email, List<Commande> commandes) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.email = email;
			this.commandes = commandes;
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

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		

		
		
		
		
		

	}
