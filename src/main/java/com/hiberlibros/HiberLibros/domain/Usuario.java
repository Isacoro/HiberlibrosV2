/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String mail;
    private String telef;
    private Double valoracionUsuario;
    private Double longitud;
    private Double latitud;
    private String uriFoto;
    private Boolean desactivado;

    /*@OneToMany(mappedBy = "usuario")
    private List<UsuarioLibro> usuarioLibro;

    @OneToMany(mappedBy = "usuario")
    private List<Relato> relato;

    @OneToMany(mappedBy = "usuario")
    private List<Preferencia> preferencia;

    @OneToMany(mappedBy = "usuarioCreador")
    private List<ForoLibro> foroLibro;*/
}
