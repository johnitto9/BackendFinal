
package com.porfolio_jpa.argprograma.Security.Repository;

import com.porfolio_jpa.argprograma.Security.Entity.Rol;
import com.porfolio_jpa.argprograma.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
