package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Genero;
import com.hiberlibros.HiberLibros.domain.Libro;
import com.hiberlibros.HiberLibros.domain.Preferencia;
import java.util.List;
import org.springframework.stereotype.Service;
import com.hiberlibros.HiberLibros.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Isabel
 */
@Service
public class GeneroService implements GeneroServiceImpl {
    
    @Autowired
    private GeneroRepository repoGenero;
    
    @Autowired
    private LibroServiceImpl serviceLS;
    
    @Autowired
    private PreferenciaServiceImpl servicePrefe;
    
    @Override
    public Genero encontrarPorId(Integer id) {
        return repoGenero.findById(id).get();
    }

    @Override
    public void guardarGenero(Genero genero) {
        genero.setDesactivado(Boolean.FALSE);
        repoGenero.save(genero);
    }

    @Override
    public Boolean borrarGenero(Integer id) {
        Genero g=encontrarPorId(id);
        List<Libro> l=serviceLS.encontrarPorGenero(g);
        List<Preferencia> p=servicePrefe.encontrarPorGenero(g);
        if((l.isEmpty() || l==null)&&(p.isEmpty() || p==null)){
            repoGenero.deleteById(id);
            return true;
        }else if (p.isEmpty() || p==null){
            Boolean result=serviceLS.bajaLibrosList(l);
            if(result){
                g.setDesactivado(Boolean.TRUE);
                repoGenero.save(g);
            }
            return result;        
        }else{
            return false;
        }        
    }

    @Override
    public List<Genero> getGeneros() {
        return repoGenero.findByDesactivado(Boolean.FALSE);
    }

    
}
