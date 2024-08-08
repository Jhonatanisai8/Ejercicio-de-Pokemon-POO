package com.isai.clase20.video.juego.pokemon.Logica;

public class Charmadar extends Pokemon implements IFuego {

    public Charmadar() {
    }

    @Override
    protected void atarcarPlacaje() {
        System.out.println("Hola soy Charmeder y este es mi ataque Placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Hola soy Charmeder y este es mi ataque Arañazo");

    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Hola soy Charmeder y este es mi ataque Mordizco");

    }

    @Override
    public void atadarPunioFuego() {
        System.out.println("Hola soy Charmeder y este es mi ataque de Puño de Fuego");
    }

    @Override
    public void lanzaLlamas() {
        System.out.println("Hola soy Charmeder y este es mi ataque de  lanzar llamas.");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmeder y este es mi ataque Ascuas");
    }

}
