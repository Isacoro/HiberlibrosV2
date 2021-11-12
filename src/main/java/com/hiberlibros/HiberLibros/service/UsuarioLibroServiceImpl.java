package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Libro;
import com.hiberlibros.HiberLibros.domain.Usuario;
import com.hiberlibros.HiberLibros.domain.UsuarioLibro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface UsuarioLibroServiceImpl {

    public UsuarioLibro encontrarId(Integer id);

    public List<UsuarioLibro> buscarContiene(String buscador, Integer id);

    public List<UsuarioLibro> buscarUsuario(Usuario u);
    
    public List<UsuarioLibro> buscarLibro(Libro l);

    public List<UsuarioLibro> buscarUsuarioDisponibilidad(Usuario u, String tengo, String disponibilidad);

    public List<UsuarioLibro> todos();

    public void guardar(UsuarioLibro ul, Libro l, Usuario u);

    public Boolean borrar(Integer id);

    public void editar(UsuarioLibro ul);

    public List<UsuarioLibro> buscarUsuariotiene(Usuario u);

    public List<UsuarioLibro> buscarDisponibles(Usuario u);

    public Boolean usuarioBorrado(Usuario u);
    
    public Boolean libroBorrado(Libro l);
    
    public Boolean librosOcupado(List<Libro> l);
    
    public Integer contarLibrosPorUsuario(Usuario u);
}
