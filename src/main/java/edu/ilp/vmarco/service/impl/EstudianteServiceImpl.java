package edu.ilp.vmarco.service.impl;

import edu.ilp.vmarco.dao.IPersonaDao;
import edu.ilp.vmarco.entity.Estudiante;
import edu.ilp.vmarco.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IPersonaDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.obtenerEstudiantePorCodigo(codigo);
    }
}
