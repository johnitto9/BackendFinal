
package com.porfolio_jpa.argprograma.Service;

import com.porfolio_jpa.argprograma.Entity.Hys;
import com.porfolio_jpa.argprograma.Repository.RHys;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class SHys {
    @Autowired
    RHys rhys;
    
    public List<Hys> list(){
        return rhys.findAll();
    }
    
    public Optional<Hys> getOne(Long id){
        return rhys.findById(id);
    }
    
    public Optional<Hys> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(Hys skill){
        rhys.save(skill);
    }
    
    public void delete(Long id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(Long id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}