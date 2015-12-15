package tn.insat.jebouquine.domain;



import java.io.Serializable;

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
		
		
		@OneToOne(cascade=CascadeType.ALL)  
		@JoinColumn(name="adresse_id")
		Panier panier ;
		
		
		public Client()
		{}
		

		public Client(String nom, String prenom, String adresse, String email) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.email = email;
		}












		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public Panier getPanier() {
			return panier;
		}


		public void setPanier(Panier panier) {
			this.panier = panier;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
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
