package com.cice.apirest.service;


import java.util.List;

public interface IGestionUsuarios {

    /**
     * Metodo que recupera una lista de nombres de usuarios
     * @return
     */

    List<String> listaNombres();

    /**
     * Metodo que crea un nuevo recurso en base de datos
     * @param name
     * @return
     */

    boolean crearUsuario(String name, String surname);

    /**
     * Metodo que actualiza un usuario de la base de datos
     * @param name
     * @return
     */

    boolean actualizarUsuario(String name);

    /**
     * Metodo que elimina un usuario de la base de datos
     * @param name
     * @return
     */

    String eliminarUsuario(String name);

}
