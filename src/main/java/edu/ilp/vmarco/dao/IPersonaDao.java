package edu.ilp.vmarco.dao;

import edu.ilp.vmarco.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long>{

}
