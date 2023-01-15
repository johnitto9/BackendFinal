
package com.porfolio_jpa.argprograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Proyectos {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    
    @Size(min = 1, max = 100, message = "no cumple con longitud")
    private String nombreProyecto;
    
    @Size(min = 1, max = 45, message = "no cumple con longitud")
    private String fecha;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String descripcion;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String url_foto;

    public Proyectos() {
    }

    public Proyectos(String nombreProyecto, String fecha, String descripcion, String url_foto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.url_foto = url_foto;
    }

    public Proyectos(String nombreProyecto, String fecha, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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