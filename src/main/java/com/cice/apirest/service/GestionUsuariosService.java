package com.cice.apirest.service;

import com.cice.apirest.entity.Usuario;
import com.cice.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("Gestion")
class GestionUsuarioService implements IGestionUsuarios {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<String> listaNombres() {
        /*List<Usuario> lista = usuarioRepository.findAll();
        List<String> nombres = new ArrayList<>();
        for(Usuario u : lista){
            nombres.add(u.getName());
        }
        return nombres;*/

        return usuarioRepository.findAll()
                .stream()
                .map(usuario -> usuario.getName())
                .collect(Collectors.toList());
    }


    @Override
    public boolean crearUsuario(String name, String surname) {
        Usuario nuevoUsuario = new Usuario(null, name, surname);
        usuarioRepository.saveAndFlush(nuevoUsuario);
        return true;
    }

    @Override
    public boolean actualizarUsuario(String name) {
        return false;
    }

    @Override
    public String eliminarUsuario(String name) {
        return null;
    }
}
