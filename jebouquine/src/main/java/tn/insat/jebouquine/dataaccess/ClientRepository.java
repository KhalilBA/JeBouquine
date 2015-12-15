package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.jebouquine.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Serializable>{

}
