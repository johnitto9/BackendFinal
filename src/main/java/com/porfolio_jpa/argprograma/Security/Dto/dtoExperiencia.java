
package com.porfolio_jpa.argprograma.Security.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreEmpresa;
    private String fecha;
    @NotBlank
    private String descripcion;
    private Long persona_id;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEmpresa, String fecha, String descripcion, Long persona_id) {
        this.nombreEmpresa = nombreEmpresa;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }

    
    //Getters & setters

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
