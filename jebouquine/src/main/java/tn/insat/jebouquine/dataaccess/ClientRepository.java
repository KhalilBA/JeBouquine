package tn.insat.jebouquine.dataaccess;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.jebouquine.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Serializable>{

 public List <Client>findByEmailAndPassword(String email, String password);

}
