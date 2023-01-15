
package com.porfolio_jpa.argprograma.Security.Service;

import com.porfolio_jpa.argprograma.Security.Entity.Rol;
import com.porfolio_jpa.argprograma.Security.Enums.RolNombre;
import com.porfolio_jpa.argprograma.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
            return irolRepository.findByRolNombre(rolNombre);
    
}
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}