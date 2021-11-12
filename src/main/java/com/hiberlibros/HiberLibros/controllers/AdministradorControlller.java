package com.hiberlibros.HiberLibros.controllers;

import com.hiberlibros.HiberLibros.dtos.EventoDto;
import com.hiberlibros.HiberLibros.domain.Evento;
import com.hiberlibros.HiberLibros.service.LibroServiceImpl;
import com.hiberlibros.HiberLibros.service.UsuarioServiceImpl;
import com.hiberlibros.HiberLibros.repository.EventoRepository;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Isabel
 */

@Controller
@RequestMapping("hiberlibros/paneladmin")
public class AdministradorControlller {


    @Autowired
    private UsuarioServiceImpl usuService;
    @Autowired
    private LibroServiceImpl libserv;
    @Autowired
    private EventoRepository evrepo;

    @GetMapping
    public String adminHub(Model m) {
           m.addAttribute("numUsuarios",usuService.contarUsuarios());
           m.addAttribute("numLibros",libserv.contarLibros());
           m.addAttribute("eventos", evrepo.findAll());
        return  "administrador/adminPanel";
    } 
    
    @GetMapping("/addEvent")
    public String formEvento(){
        return "administrador/eventoForm";
    }
   
    @PostMapping("/evento")
    public String addEvento(Model m, Evento e,@DateTimeFormat(pattern="yyyy-MM-dd")Date startDate,@DateTimeFormat(pattern="yyyy-MM-dd")Date endDate){
        e.setStartDate(startDate);
        e.setEndDate(endDate);
        evrepo.save(e);
        return "redirect:/hiberlibros/paneladmin";
    }
     @GetMapping("/deleteEvento")
    @ResponseBody
      public void eliminar(Integer id){
          evrepo.deleteById(id);
      }
    @GetMapping("/buscarEvento")
    @ResponseBody
    public List<EventoDto> buscar(String search){
       return evrepo.findBySummaryContainingIgnoreCase(search).stream().map(x->new EventoDto(x.getId(),x.getSummary()) ).collect(Collectors.toList());
    }
    

    @GetMapping("/contacto")
    public String adminContacto(Model m) {
        return "administrador/contacto";
    }
}
