package edu.ilp.vmarco.dao;

import edu.ilp.vmarco.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
