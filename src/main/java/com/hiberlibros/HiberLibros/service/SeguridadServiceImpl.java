package com.hiberlibros.HiberLibros.service;

/**
 *
 * @author Usuario
 */
public interface SeguridadServiceImpl {

    public String altaUsuarioSeguridad(String mail, Integer idUsuario, String password, String nombre_rol);

    public long bajaUsuarioSeguridad(Integer idUsuarioSeguridad);

    public long bajaUsuarioSeguridadPorMail(String mailUsuarioSeguridad);

    public String getMailFromContext();
    
    public Integer getIdUsuarioFromContext();
}
