package com.sinensia.railes.service;

import java.util.List;

import com.sinensia.railes.model.Tren;

public interface TrenesService {
    List<Tren> buscarTrenesEntreVagones(int minVagones, int maxVagones);
    void actualizarVagones(int idTren, int vagones);
    List<Tren> trenes();
}
