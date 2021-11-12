/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Editorial;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface EditorialServiceImpl {
    
    public Editorial encontrarPorId(Integer id);
    
    public List<Editorial> consultaTodas();

    public void altaModificacionEditorial(Editorial editorial);

    public Boolean bajaEditorial(Integer idEditorial);

    public Editorial consultaPorIdEditorial(int idEditorial);

    public List<Editorial> consultaPorNombreEditorial(Editorial editorial);
    
}
