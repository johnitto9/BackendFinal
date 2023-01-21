
package com.porfolio_jpa.argprograma.Controller;

import com.porfolio_jpa.argprograma.Entity.Experiencia;
import com.porfolio_jpa.argprograma.Security.Controller.Mensaje;
import com.porfolio_jpa.argprograma.Security.Dto.dtoExperiencia;
import com.porfolio_jpa.argprograma.Service.ServExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/explab")
@CrossOrigin(origins = {"https://frontendjpa-61155.web.app","http://localhost:4200"})
public class CExperiencia {
    @Autowired
    ServExperiencia servexperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = servexperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") Long id){
        if(!servexperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = servexperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
        @PreAuthorize("hasRole('ADMIN')")
        @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!servexperiencia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        servexperiencia.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
    
     @PreAuthorize("hasRole('ADMIN')")
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(servexperiencia.existsByNombreEmpresa(dtoexp.getNombreEmpresa()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoexp.getNombreEmpresa(), dtoexp.getFecha(), dtoexp.getDescripcion());
        servexperiencia.save(experiencia);
        
      
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    
}
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody dtoExperiencia dtoexp){
        //Validamos si existe el ID
        if(!servexperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(servexperiencia.existsByNombreEmpresa(dtoexp.getNombreEmpresa()) && servexperiencia.getByNombreEmpresa(dtoexp.getNombreEmpresa()).get().getId_exp() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getNombreEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = servexperiencia.getOne(id).get();
        experiencia.setNombreEmpresa(dtoexp.getNombreEmpresa());
        experiencia.setDescripcion((dtoexp.getDescripcion()));
        experiencia.setFecha((dtoexp.getFecha()));
        
        servexperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
    
    }
