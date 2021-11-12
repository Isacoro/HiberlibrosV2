package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Autor;
import com.hiberlibros.HiberLibros.domain.Editorial;
import com.hiberlibros.HiberLibros.domain.Genero;
import com.hiberlibros.HiberLibros.domain.Libro;
import java.util.List;


public interface LibroServiceImpl {

    public List<Libro> buscarLibro(String libro);
    
    public List<Libro> encontrarDisponible();

    public Libro libroId(Integer id);

    public void guardarLibro(Libro l);

    public Integer contarLibros();

    public List<Libro> encontrarPorAutor(Autor a);
    
    public List<Libro> encontrarPorAutorActivos(Autor a);

    public void valorarLibro(Libro l, Integer valoracion);
    
    public Boolean bajaLibroId(Integer id);
    
    public Boolean bajaLibrosList(List<Libro> l);
    
    public List<Libro> encontrarPorGenero(Genero g);
    
    public List<Libro> encontrarPorEditorial(Editorial e);
    
    public List<Libro> findByTituloContainingIgnoreCase(String search);

}
