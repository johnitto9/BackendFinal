
package com.porfolio_jpa.argprograma.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con longitud")
    private String apellido;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String acerca_de;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String url_foto;

    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String url_portada;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String acerca_de, String url_foto, String url_portada) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca_de = acerca_de;
        this.url_foto = url_foto;
        this.url_portada = url_portada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
