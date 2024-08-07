package com.isai.clase20.video.juego.pokemon.Logica;

public abstract class Pokemon {

    /*Atributos que solo has hijas pueden tener*/
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atarcarPlacaje();

    protected abstract void atarcarAraniazo();

    protected abstract void atarcarMordisco();

}
