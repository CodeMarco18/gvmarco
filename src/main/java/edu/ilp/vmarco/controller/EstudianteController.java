package edu.ilp.vmarco.controller;

import edu.ilp.vmarco.dao.IEstudianteDao;
import edu.ilp.vmarco.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteDao estudianteService;


    //Buscar un estudiante por su código
    @GetMapping("/buscarEstudianteBycodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);
    }


    @GetMapping("/saludo")
    public String saludo(){
        return "Hola es desde controller Estudiante";
    }
}
