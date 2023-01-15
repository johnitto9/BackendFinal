
package com.porfolio_jpa.argprograma.Repository;

import com.porfolio_jpa.argprograma.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia,Long> {
    
    public Optional <Experiencia> findByNombreEmpresa(String nombreEmpresa);
    public boolean existsByNombreEmpresa(String nombreEmpresa);
    
}
