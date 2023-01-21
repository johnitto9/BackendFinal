
package com.porfolio_jpa.argprograma.Security.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String acerca_de;
    @NotBlank
    private String url_foto;
    @NotBlank
    private String url_portada;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String acerca_de, String url_foto, String url_portada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_portada = url_portada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public String getUrl_portada() {
        return url_portada;
    }

    public void setUrl_portada(String url_portada) {
        this.url_portada = url_portada;
    }

}