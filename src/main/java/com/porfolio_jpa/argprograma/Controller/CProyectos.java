
package com.porfolio_jpa.argprograma.Controller;

import com.porfolio_jpa.argprograma.Entity.Proyectos;
import com.porfolio_jpa.argprograma.Security.Controller.Mensaje;
import com.porfolio_jpa.argprograma.Security.Dto.dtoProyectos;
import com.porfolio_jpa.argprograma.Service.ServProyectos;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = {"https://frontendjpa-61155.web.app","http://localhost:4200"})
public class CProyectos {
     @Autowired
    ServProyectos servProyectos;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list() {
        List<Proyectos> list = servProyectos.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") Long id) {
        if (!servProyectos.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proyectos proyectos = servProyectos.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!servProyectos.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        servProyectos.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyectos dtoproyectos){      
        if(StringUtils.isBlank(dtoproyectos.getNombreProyecto()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(servProyectos.existsByNombreProyecto(dtoproyectos.getNombreProyecto()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = new Proyectos(dtoproyectos.getNombreProyecto(), dtoproyectos.getFecha(), dtoproyectos.getDescripcion(), dtoproyectos.getUrl_foto());
        servProyectos.save(proyectos);
        
      
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    
}
    
     @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody dtoProyectos dtoproyectos){
        //Validamos si existe el ID
        if(!servProyectos.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(servProyectos.existsByNombreProyecto(dtoproyectos.getNombreProyecto()) && servProyectos.getByNombreProyecto(dtoproyectos.getNombreProyecto()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoproyectos.getNombreProyecto()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = servProyectos.getOne(id).get();
        proyectos.setNombreProyecto(dtoproyectos.getNombreProyecto());
        proyectos.setDescripcion(dtoproyectos.getDescripcion());
        proyectos.setFecha(dtoproyectos.getFecha());
        proyectos.setUrl_foto(dtoproyectos.getUrl_foto());
        
        servProyectos.save(proyectos);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
    
}
