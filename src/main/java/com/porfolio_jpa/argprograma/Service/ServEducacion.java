
package com.porfolio_jpa.argprograma.Service;

import com.porfolio_jpa.argprograma.Entity.Educacion;
import com.porfolio_jpa.argprograma.Repository.REducacion;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServEducacion {
@Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(Long id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNmbreEstudio(String nombreEstudio){
        return rEducacion.findByNombreEstudio(nombreEstudio);
    }
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(Long id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(Long id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreEstudio(String nombreEstudio){
        return rEducacion.existsByNombreEstudio(nombreEstudio);
    }
}
