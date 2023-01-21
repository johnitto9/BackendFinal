
package com.porfolio_jpa.argprograma.Security.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
@NotBlank
    private String nombreEstudio;
    @NotBlank
    private String descripcion;
    private String fecha;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEstudio, String descripcion, String fecha) {
        this.nombreEstudio = nombreEstudio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}