package com.cice.apirest.web.rest;

import com.cice.apirest.service.IGestionUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/usuario")
public class UserResource {

    @Autowired
    @Qualifier("Gestion")
    IGestionUsuarios gestionUsuarios;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUsuarios(){
        return new ResponseEntity<>(gestionUsuarios.listaNombres(), HttpStatus.OK);
    }

    @RequestMapping(value = "/usuario/{name}/{surname}" ,method = RequestMethod.POST)
    public void crearUsuario(@PathVariable("name") String name,
                             @PathVariable("surname") String surname) {

        gestionUsuarios.crearUsuario(name, surname);

    }
}
