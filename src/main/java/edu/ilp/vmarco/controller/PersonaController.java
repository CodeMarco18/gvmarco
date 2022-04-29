package edu.ilp.vmarco.controller;



import edu.ilp.vmarco.entity.Persona;
import edu.ilp.vmarco.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //Listar personas
    @GetMapping("/listaPersonas")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    }


    @GetMapping("/saludo")
    public String saludo(){
        return "Hola es desde controller Persona ";
    }
}
