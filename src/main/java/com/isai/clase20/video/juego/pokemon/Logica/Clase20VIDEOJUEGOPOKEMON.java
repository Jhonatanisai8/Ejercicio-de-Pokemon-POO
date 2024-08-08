package com.isai.clase20.video.juego.pokemon.Logica;
public class Clase20VIDEOJUEGOPOKEMON {

    public static void main(String[] args) {
        System.out.println("\n\t==ELEMENTODE POO CON POKEMONES==");
        Squartel squartel = new Squartel();
        Charmadar charmadar = new Charmadar();
        Bulbasor bulbasor = new Bulbasor();
        Picachu picachu = new Picachu();

        //llamamos a los metodos
        squartel.atarcarAraniazo();
        squartel.atacarHidrobomba();
        
        charmadar.atarcarAraniazo();
        charmadar.lanzaLlamas();
        
        bulbasor.atarcarAraniazo();
        bulbasor.atacarDrenaje();
        
        picachu.atacarImpactrueno();
    }

}
