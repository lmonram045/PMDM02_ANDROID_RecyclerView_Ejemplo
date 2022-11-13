package com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.modelos;

import java.io.Serializable;

public class Articulo implements Serializable {
    private int codigo;
    private String nombre;
    private int imageId;
    private Double precio;

    // Constructor
    public Articulo(int codigo, String nombre, int imageId, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.imageId = imageId;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
