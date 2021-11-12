package com.hiberlibros.HiberLibros.repository;

import com.hiberlibros.HiberLibros.domain.Rol;
import com.hiberlibros.HiberLibros.domain.UsuarioSeguridad;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Integer> {

    //public long deleteByIdUsuarioSeguridad(Integer idUsuarioSeguridad);
    public Optional<Rol> findByIdUsuario(UsuarioSeguridad us);
}
