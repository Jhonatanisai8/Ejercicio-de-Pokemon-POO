package com.isai.clase20.video.juego.pokemon.Logica;

public class Bulbasor extends Pokemon implements IPlanta {

    public Bulbasor() {
    }

    @Override
    protected void atarcarPlacaje() {
        System.out.println("Hola soy Bulbasour y este es mi ataque placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Hola soy Bulbasour y este es mi ataque arañazo");
    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Hola soy Bulbasour y este es mi ataque Mordizco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasour y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasour y este es mi ataque Paralizar");
    }

}
