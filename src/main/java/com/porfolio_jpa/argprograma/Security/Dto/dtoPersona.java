
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

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String acercca_de, String url_foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
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

    public void setAcercca_de(String acercca_de) {
        this.acerca_de = acercca_de;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
    
    

    
}
