package com.hiberlibros.HiberLibros.repository;

import com.hiberlibros.HiberLibros.domain.Peticion;
import com.hiberlibros.HiberLibros.domain.Usuario;
import com.hiberlibros.HiberLibros.domain.UsuarioLibro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeticionRepository extends JpaRepository<Peticion, Integer> {

    public List<Peticion> findByPendienteTratar(Boolean b);

    public List<Peticion> findByAceptacion(Boolean p);

    public List<Peticion> findByPendienteTratarAndIdUsuarioSolicitante(Boolean b, Usuario u); //busca por el usuario y si esta sin tratar

    public List<Peticion> findByIdUsuarioLibroAndPendienteTratar(UsuarioLibro ul, Boolean b); //busca por usuario libro y que no este tratado
    
    public void deleteByIdUsuarioSolicitante(Usuario u); 
    
    public void deleteByIdUsuarioLibro(UsuarioLibro ul);

}
