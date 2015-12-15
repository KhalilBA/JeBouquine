package tn.insat.jebouquine.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.jebouquine.domain.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

	

}