package com.hiberlibros.HiberLibros.service;

import com.hiberlibros.HiberLibros.domain.Genero;
import com.hiberlibros.HiberLibros.domain.Preferencia;
import com.hiberlibros.HiberLibros.domain.Usuario;
import com.hiberlibros.HiberLibros.repository.PreferenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiberlibros.HiberLibros.repository.UsuarioRepository;

/**
 *
 * @author Isabel
 */
@Service
public class PreferenciaService implements PreferenciaServiceImpl {

    @Autowired
    private PreferenciaRepository prefRepo;
    @Autowired
    private UsuarioRepository usuRepo;

    @Override
    public List<Preferencia> findByUsuario(Usuario usuario) {
        return prefRepo.findByUsuario(usuario);
    }

    @Override
    public List<Preferencia> findAll() {
        return prefRepo.findAll();
    }

    @Override
    public void addPreferencia(Preferencia preferencia) {
        prefRepo.save(preferencia);
    }

    @Override
    public void borrarPreferencia(Integer id) {
        prefRepo.deleteById(id);
    }

    @Override
    public void borrarPorGenero(Genero g) {
        prefRepo.deleteByGenero(g);
    }

    @Override
    public List<Preferencia> encontrarPorGenero(Genero g) {
        return prefRepo.findByGenero(g);
    }
}
