package com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.modelos;

import com.montoyaramirezluis.pmdm02_android_recyclerview_ejemplo.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Articulos implements Serializable {
    private List<Articulo> lista;

    public Articulos() {
        lista = new ArrayList<>();
    }

    public List<Articulo> getLista() {
        return lista;
    }

    public void setLista(List<Articulo> lista) {
        this.lista = lista;
    }

    /**
     * Método que devuelve una lista de artículos de ejemplo
     */
    public void cargar(){
        lista.add(new Articulo(1, "Pizza marinera", R.drawable.pizza1, 8.5));
        lista.add(new Articulo(2, "Pizza jamon", R.drawable.pizza2, 8.0));
        lista.add(new Articulo(3, "Pizza cuatro estaciones", R.drawable.pizza3, 9.0));
        lista.add(new Articulo(4, "Pizza cuatro quesos", R.drawable.pizza4, 8.0));
        lista.add(new Articulo(5, "Pizza procciutto", R.drawable.pizza5, 6.75));
        lista.add(new Articulo(6, "Pizza barbacoa", R.drawable.pizza6, 8.0));
        lista.add(new Articulo(7, "Pizza pimientos y queso`", R.drawable.pizza7, 8.5));
        lista.add(new Articulo(8, "Pizza completa", R.drawable.pizza8, 10.0));
        lista.add(new Articulo(9, "Pizza la traviata", R.drawable.pizza1, 11.0));
        lista.add(new Articulo(10, "Pizza sabor a mar", R.drawable.pizza2, 7.0));

        lista.add(new Articulo(11, "Pizza marinera", R.drawable.pizza1, 8.5));
        lista.add(new Articulo(12, "Pizza jamon", R.drawable.pizza2, 8.0));
        lista.add(new Articulo(13, "Pizza cuatro estaciones", R.drawable.pizza3, 9.0));
        lista.add(new Articulo(14, "Pizza cuatro quesos", R.drawable.pizza4, 8.0));
        lista.add(new Articulo(15, "Pizza procciutto", R.drawable.pizza5, 6.75));
        lista.add(new Articulo(16, "Pizza barbacoa", R.drawable.pizza6, 8.0));
        lista.add(new Articulo(17, "Pizza pimientos y queso`", R.drawable.pizza7, 8.5));
        lista.add(new Articulo(18, "Pizza completa", R.drawable.pizza8, 10.0));
        lista.add(new Articulo(19, "Pizza la traviata", R.drawable.pizza1, 11.0));
        lista.add(new Articulo(20, "Pizza sabor a mar", R.drawable.pizza2, 7.0));


    }


}
