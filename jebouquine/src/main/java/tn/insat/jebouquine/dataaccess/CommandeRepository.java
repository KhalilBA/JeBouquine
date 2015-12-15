package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.jebouquine.domain.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Serializable> {

}
