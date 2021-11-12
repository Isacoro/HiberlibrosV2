package com.hiberlibros.HiberLibros.repository;

import com.hiberlibros.HiberLibros.domain.Intercambio;
import com.hiberlibros.HiberLibros.domain.UsuarioLibro;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface IntercambioRepository extends JpaRepository<Intercambio, Integer> {

    public List<Intercambio> findByUsuarioPrestador(UsuarioLibro ul);

    public List<Intercambio> findByUsuarioPrestatario(UsuarioLibro ul);
    
    public List<Intercambio> findByUsuarioPrestadorAndFechaDevolucion(UsuarioLibro ul, Date fechaDevolucion);
    
    public List<Intercambio> findByUsuarioPrestatarioAndFechaDevolucion(UsuarioLibro ul, Date fechaDevolucion);
    
    public void deleteByUsuarioPrestadorOrUsuarioPrestatario(UsuarioLibro ul, UsuarioLibro ul2);
    
    public Integer countByFechaDevolucionAndUsuarioPrestador(Date fecha, UsuarioLibro ul);
    
    public Integer countByFechaDevolucionAndUsuarioPrestatario(Date fecha, UsuarioLibro ul);
    
    
  
}
