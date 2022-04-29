package edu.ilp.vmarco.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "persona")
@Inheritance( strategy = InheritanceType.JOINED )
@PrimaryKeyJoinColumn(referencedColumnName = "iddireccion")
public class Persona extends Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idpersona", length = 10)
    private Long idPersona;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;


    @Column(name = "telefono",length = 50)
    private String telefono;

    private String email;


    //constructor sin nada
    public Persona() {
    }

    //constructor idPersona

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    //constructor
    public Persona(Long idPersona, String nombre, String telefono, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //get and set


    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
