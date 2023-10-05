package com.sinensia.railes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trenes")
public class Tren {
    @Id
    private int idTren;
    private String modeloTren;
    private String mercancia;
    private int vagones;

    /**
     * Constructor vacío.
     */
    public Tren() {
    }

    /**
     * Constructor con ID.
     * 
     * @param Id
     */
    public Tren(int idTren) {
        this.idTren = idTren;
    }

    /**
     * Constructor con parámetros.
     * 
     * @param idTren
     * @param modeloTren
     * @param mercancia
     * @param vagones
     */
    public Tren(int idTren, String modeloTren, String mercancia, int vagones) {
        this.idTren = idTren;
        this.modeloTren = modeloTren;
        this.mercancia = mercancia;
        this.vagones = vagones;
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public String getModeloTren() {
        return modeloTren;
    }

    public void setModeloTren(String modeloTren) {
        this.modeloTren = modeloTren;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
}
