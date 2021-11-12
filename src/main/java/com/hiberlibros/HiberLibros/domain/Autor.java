package com.hiberlibros.HiberLibros.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Isabel
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String biografia;
    
    private Boolean desactivado;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;
}
