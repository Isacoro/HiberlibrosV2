/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiberlibros.HiberLibros.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Isabel
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeneroDto {
    private Integer id;
    private String nombre;
    
}
