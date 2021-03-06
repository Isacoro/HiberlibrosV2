package com.hiberlibros.HiberLibros.controllers;

import com.hiberlibros.HiberLibros.domain.Libro;
import com.hiberlibros.HiberLibros.service.AutorServiceImpl;
import com.hiberlibros.HiberLibros.service.EditorialServiceImpl;
import com.hiberlibros.HiberLibros.service.GeneroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hiberlibros.HiberLibros.service.LibroServiceImpl;

/**
 *
 * @author Isabel
 */

@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroServiceImpl libroService;
    @Autowired
    private GeneroServiceImpl serviceGen;
    @Autowired
    private EditorialServiceImpl serviceEdit;
    @Autowired
    private AutorServiceImpl serviceAutor;

    @GetMapping("/libros")
    public String mostrarFormulario(Model m) {
        m.addAttribute("libros", libroService.encontrarDisponible());
        m.addAttribute("generos", serviceGen.getGeneros());
        m.addAttribute("editoriales", serviceEdit.consultaTodas());
        m.addAttribute("autores", serviceAutor.consultarAutores());
        return "libros/VistaLibro";
    }

    @PostMapping("/guardar")
    public String guardarLIbro(Model m, Libro libro, Integer id_genero, Integer id_editorial, Integer id_autor) {
        libro.setGenero(serviceGen.encontrarPorId(id_genero));
        libro.setEditorial(serviceEdit.encontrarPorId(id_editorial));
        libro.setAutor(serviceAutor.encontrarAutor(id_autor).get());
        libroService.guardarLibro(libro);
        return "redirect:/libros";
    }

    @GetMapping("/eliminar")
    public String eliminarLibro(Model m, Integer id) {
        if (libroService.bajaLibroId(id)) {
            m.addAttribute("borrado", "Borrado con éxito");
        } else {
            m.addAttribute("borrado", "Error, no es posible borrar este autor");
        }
        return "redirect:libros";
    }

    @GetMapping("/modificar")
    public String modificarLibro(Model m, Integer id) {

        m.addAttribute("imagen", libroService.libroId(id).getUriPortada());
        m.addAttribute("libro", libroService.libroId(id));
        m.addAttribute("generos", serviceGen.getGeneros());
        m.addAttribute("editoriales", serviceEdit.consultaTodas());
        m.addAttribute("autores", serviceAutor.consultarAutores());

        return "/libros/modificar";
    }

    @GetMapping("/listarAdmin")
    private String listarTodo(Model m, String borrado) {
        m.addAttribute("libros", libroService.encontrarDisponible());
        m.addAttribute("generos", serviceGen.getGeneros());
        m.addAttribute("editoriales", serviceEdit.consultaTodas());
        m.addAttribute("autores", serviceAutor.consultarAutores());
        if(borrado!=null){
            m.addAttribute("borrado",borrado);
        }

        return "/administrador/libros";
    }

    @PostMapping("/guardarAdmin")
    public String guardarAdmin(Model m, Libro libro, Integer id_genero, Integer id_editorial, Integer id_autor) {
        libro.setGenero(serviceGen.encontrarPorId(id_genero));
        libro.setEditorial(serviceEdit.encontrarPorId(id_editorial));
        libro.setAutor(serviceAutor.encontrarAutor(id_autor).get());
        libroService.guardarLibro(libro);
        
        return "redirect:listarAdmin";
    }

    @GetMapping("/eliminarAdmin")
    public String eliminarAdmin(Integer id) {
        String borrado="";
        if (libroService.bajaLibroId(id)) {
            borrado="Borrado con éxito";
        } else {
           borrado= "Error, no es posible borrar este autor";
        }
        return "redirect:listarAdmin?borrado="+borrado;
    }

    @PostMapping("/addValoracionLibro")
    public String addValoracionLibro(Model m, Integer id, Integer valoracion) {
        libroService.valorarLibro(libroService.libroId(id), valoracion);

        return "redirect:/hiberlibros/buscarLibro";
    }
}
