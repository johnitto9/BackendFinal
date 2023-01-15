
package com.porfolio_jpa.argprograma.Repository;

import com.porfolio_jpa.argprograma.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducacion extends JpaRepository<Educacion, Long>{
    public Optional<Educacion> findByNombreEstudio(String nombreEstudio);
    public boolean existsByNombreEstudio(String nombreEstudio);
}