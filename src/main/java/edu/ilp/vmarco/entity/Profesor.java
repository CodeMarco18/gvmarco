package edu.ilp.vmarco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "Profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Profesor extends Persona{


    @Column( name = "salario", length = 50)
    private String salario;

    public Profesor() {
    }

    public Profesor(String salario) {
        this.salario = salario;
    }

    public Profesor(Long idPersona, String salario) {
        super(idPersona);
        this.salario = salario;
    }

    public Profesor(Long idPersona, String nombre, String telefono, String email, String salario) {
        super(idPersona, nombre, telefono, email);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
