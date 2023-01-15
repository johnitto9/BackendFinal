/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio_jpa.argprograma.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author cisne
 */
public class dtoProyectos {
    @NotBlank
    private String nombreProyecto;
    private String fecha;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String url_foto;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreProyecto, String fecha, String descripcion, String url_foto) {
        this.nombreProyecto = nombreProyecto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.url_foto = url_foto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
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

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
    
    
    
}
