package com.isai.clase20.video.juego.pokemon.Logica;

public class Picachu extends Pokemon implements IElectrico {

    public Picachu() {
    }

    @Override
    protected void atarcarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");

    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordizco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impac Trueno");
    }

    @Override
    public void atarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puño Trueño");
    }

}
