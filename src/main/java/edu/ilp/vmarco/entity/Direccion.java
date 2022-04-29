package edu.ilp.vmarco.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddireccion;

    @Column(name = "calle",length = 50)
    private String calle;

    @Column(name = "ciudad",length = 50)
    private String ciudad;

    @Column(name = "estado",length = 50)
    private String estado;

    @Column(name = "codigopostal",length = 50)
    private String codigopostal;

    @Column(name = "pais",length = 50)
    private String pais;

    private String idpersona;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idpersona")
    private Persona persona;


}
