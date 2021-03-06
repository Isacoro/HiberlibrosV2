package com.hiberlibros.HiberLibros.service;

import java.util.List;
import java.util.Optional;

import com.hiberlibros.HiberLibros.dtos.LibroDto;
import com.hiberlibros.HiberLibros.domain.Autor;

public interface AutorServiceImpl {

    public void guardarAutor(Autor a);

    public Optional<Autor> encontrarAutor(Integer id);

    public Boolean borrarAutor(Integer id);

    public List<Autor> buscarAutores(String buscar);

    public List<Autor> consultarAutores();

    public List<LibroDto> getLibros(Integer id);
}
