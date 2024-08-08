package com.isai.clase20.video.juego.pokemon.Logica;

public class Squartel extends Pokemon implements IAgua {

    public Squartel() {
    }

    @Override
    protected void atarcarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Arañazo");

    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque Mordizco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque HidroBomba");
    }

    @Override
    public void atarcarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque Pistola Agua");
    }

}
