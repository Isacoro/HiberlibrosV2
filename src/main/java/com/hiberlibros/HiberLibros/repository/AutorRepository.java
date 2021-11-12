package com.hiberlibros.HiberLibros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiberlibros.HiberLibros.domain.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    
    public Optional<Autor> findByIdAutorAndDesactivado(Integer id, Boolean desactivado);
    public List<Autor> findByNombreContainsIgnoreCaseOrApellidosContainsIgnoreCase(String nombre, String apellidos);
    public List<Autor> findByDesactivado(Boolean desactivado);

}
