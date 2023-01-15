
package com.porfolio_jpa.argprograma.Repository;

import com.porfolio_jpa.argprograma.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHys extends JpaRepository<Hys, Long>{
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
    

