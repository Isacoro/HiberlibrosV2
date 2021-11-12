package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Genero;
import java.util.List;

/**
 *
 * @author Isabel
 */
public interface GeneroServiceImpl {
    
    public Genero encontrarPorId(Integer id);

    public void guardarGenero(Genero genero);

    public Boolean borrarGenero(Integer id);

    public List<Genero> getGeneros();

}
