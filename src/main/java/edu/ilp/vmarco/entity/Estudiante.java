package edu.ilp.vmarco.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name= "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends  Persona{

    @Column(name = "codigo", length = 10,nullable = false)
    private String codigo;

    @Column(name = "serie", length = 10)
    private String serie;

    public Estudiante() {

    }
    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String codigo, String serie) {
        super(idPersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String nombre, String telefono, String email, String codigo, String serie) {
        super(idPersona, nombre, telefono, email);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
