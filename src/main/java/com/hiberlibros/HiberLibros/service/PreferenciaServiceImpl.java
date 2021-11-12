package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Genero;
import com.hiberlibros.HiberLibros.domain.Preferencia;
import com.hiberlibros.HiberLibros.domain.Usuario;
import java.util.List;

/**
 *
 * @author Isabel
 */
public interface PreferenciaServiceImpl {

    //Todas las preferencias
    List<Preferencia> findAll();

    //Preferencias por usuario
    public List<Preferencia> findByUsuario(Usuario usuario);
    
    public List<Preferencia> encontrarPorGenero(Genero g);

    //Añadir preferencia
    public void addPreferencia(Preferencia preferencia);

    //Borrar preferencia
    public void borrarPreferencia(Integer id);
    
    public void borrarPorGenero(Genero g);

}
