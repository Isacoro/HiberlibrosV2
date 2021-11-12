package com.hiberlibros.HiberLibros.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Isabel
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="editoriales")
public class Editorial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombreEditorial;
    private Boolean desactivado;
    
//    @OneToMany
//    @JoinColumn(name = "idEditorial")
// private List<Libro> ListaLibros;

}