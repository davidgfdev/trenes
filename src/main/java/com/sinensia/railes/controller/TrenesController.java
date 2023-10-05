package com.sinensia.railes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.railes.model.Tren;
import com.sinensia.railes.service.TrenesService;

@RestController
public class TrenesController {
    
    @Autowired
    TrenesService trenesService;

    private static final String JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON_VALUE;

    /**
     * Devuelve una lista de trenes que tienen un número de vagones entre los dos especificados.
     * 
     * @param minVagones
     * @param maxVagones
     * @return listaTrenes
     */
    @GetMapping(value = "trenes/{minVagones}/{maxVagones}", produces = JSON_MEDIA_TYPE)
    public List<Tren> buscarTrenesEntreVagones(
        @PathVariable int minVagones, 
        @PathVariable int maxVagones
    ){
        return trenesService.buscarTrenesEntreVagones(minVagones, maxVagones);
    }

    /**
     * Actualiza la mercancía del tren especificado si lo encuentra.
     * 
     * @param idTren
     * @param mercancia
     */
    @PutMapping(value = "tren/{idTren}/{vagones}")
    public void actualizarVagones(@PathVariable int idTren, @PathVariable int vagones){
        trenesService.actualizarVagones(idTren, vagones);
    }
}
