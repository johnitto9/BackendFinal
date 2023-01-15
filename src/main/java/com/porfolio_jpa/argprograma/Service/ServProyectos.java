
package com.porfolio_jpa.argprograma.Service;


import com.porfolio_jpa.argprograma.Entity.Proyectos;
import com.porfolio_jpa.argprograma.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ServProyectos {
  
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(Long id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombreProyecto(String nombreProyecto){
        return rProyectos.findByNombreProyecto(nombreProyecto);
    }
    
    public void save(Proyectos proyectos){
        rProyectos.save(proyectos);
    }
    
    public void delete(Long id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(Long id){
        return rProyectos.existsById(id);
    }
    
   
public boolean existsByNombreProyecto(String nombreProyecto){
return rProyectos.existsByNombreProyecto(nombreProyecto);
    }
}