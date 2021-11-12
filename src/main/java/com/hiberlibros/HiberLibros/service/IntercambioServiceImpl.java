package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Intercambio;
import com.hiberlibros.HiberLibros.domain.UsuarioLibro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IntercambioServiceImpl {

    public void guardarIntercambio(UsuarioLibro ul_prestatario, UsuarioLibro ul_prestador);

    public List<Intercambio> encontrarULPrestador(List<UsuarioLibro> ul);

    public List<Intercambio> encontrarULPrestatario(List<UsuarioLibro> ul);

    public void finIntercambio(Integer id);
    
    public Boolean intercambioPendienteFinalizar(UsuarioLibro ul);
    
    public Integer contarIntercambiosPendientes(List<UsuarioLibro> ul);
    

}
