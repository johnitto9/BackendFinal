
package com.porfolio_jpa.argprograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;



@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreEstudio;
   @Size(min = 1, max = 45, message = "no cumple con longitud")
    private String fecha;
    
    @Size(min = 1, max = 200, message = "no cumple con longitud")
    private String descripcion;

    public Educacion() {
    }

    public Educacion(String nombreEstudio, String fecha, String descripcion) {
        this.id = id;
        this.nombreEstudio = nombreEstudio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
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
    
    

}
