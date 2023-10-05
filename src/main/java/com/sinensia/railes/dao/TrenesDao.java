package com.sinensia.railes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.railes.model.Tren;
import java.util.List;

public interface TrenesDao extends JpaRepository<Tren, Integer>{
    /**
     * Devuelve una lista con todos los vagones 
     * entre un número determinado de vagones.
     * 
     * @param minVagones
     * @param maxVagones
     * @return listaTrenes
     */
    List<Tren> findAllByVagonesBetween(int minVagones, int maxVagones);
}
