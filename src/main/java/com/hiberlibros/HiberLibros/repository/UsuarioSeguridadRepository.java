package com.hiberlibros.HiberLibros.repository;

import com.hiberlibros.HiberLibros.domain.UsuarioSeguridad;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioSeguridadRepository extends CrudRepository<UsuarioSeguridad, Integer> {

    // public Optional<UsuarioSeguridad> findByNombre(String username);
    public Optional<UsuarioSeguridad> findByIdUsuario(int idUsuario);

    public Optional<UsuarioSeguridad> findByMail(String mail);
}
