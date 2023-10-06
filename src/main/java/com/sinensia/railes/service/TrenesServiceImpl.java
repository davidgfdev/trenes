package com.sinensia.railes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.railes.dao.TrenesDao;
import com.sinensia.railes.model.Tren;

@Service
public class TrenesServiceImpl implements TrenesService{

    @Autowired
    TrenesDao trenesDao;

    /**
     * Devuelve una lista con todos los trenes entre los valores especificados de vagones.
     * 
     * @param minVagones
     * @param maxVagones
     * @return listaTrenes
     */
    @Override
    public List<Tren> buscarTrenesEntreVagones(int minVagones, int maxVagones) {
        return trenesDao.findAllByVagonesBetween(minVagones, maxVagones);
    }

    /**
     * Actualiza el número de vagones actuales del tren
     * 
     * @param idTren
     * @param vagones
     */
    @Override
    public void actualizarVagones(int idTren, int vagones) {
        Tren tren = trenesDao.findById(idTren).orElse(null);
        if (tren != null){
            tren.setVagones(vagones);
            trenesDao.save(tren);
        }
    }

    /**
     * Devuelve una lista con todos los trenes.
     * 
     * @return listaTrenes
     */
    @Override
    public List<Tren> trenes(){
        return trenesDao.findAll();
    }
}
