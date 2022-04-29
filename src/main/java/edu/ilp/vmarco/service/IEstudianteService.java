package edu.ilp.vmarco.service;


import edu.ilp.vmarco.entity.Estudiante;

public interface IEstudianteService {

    //Buscar un estudiante por su código
    Estudiante obtenerEstudiantePorCodigo(String codigo);

}
