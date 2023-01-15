
package com.porfolio_jpa.argprograma.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id_exp;
    
    @Size(min = 1, max = 100, message = "no cumple con longitud")
    private String nombreEmpresa;
    
    @Size(min = 1, max = 45, message = "no cumple con longitud")
    private String fecha;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String descripcion;
    
    private Long persona_id;
    
    //constructores

    public Experiencia() {
    }

    

    public Experiencia(String nombreEmpresa, String fecha, String descripcion) {
        this.id_exp = id_exp;
        this.nombreEmpresa = nombreEmpresa;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }

    //Getters & setters
    public Long getId_exp() {
        return id_exp;
    }

    public void setId_exp(Long id_exp) {
        this.id_exp = id_exp;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Long persona_id) {
        this.persona_id = persona_id;
    }


    
    
   
}
    

