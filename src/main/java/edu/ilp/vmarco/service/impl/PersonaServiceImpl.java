package edu.ilp.vmarco.service.impl;

import edu.ilp.vmarco.dao.IPersonaDao;
import edu.ilp.vmarco.entity.Persona;
import edu.ilp.vmarco.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;


    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }
}
