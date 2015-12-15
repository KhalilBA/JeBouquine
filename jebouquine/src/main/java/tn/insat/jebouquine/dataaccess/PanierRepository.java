package tn.insat.jebouquine.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.jebouquine.domain.Panier;

public interface PanierRepository extends JpaRepository<Panier, Long> {
}
