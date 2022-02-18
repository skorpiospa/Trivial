package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean noGanador;

    public static void main(String[] args) {
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Maria");


        Random rand = new Random();
        if (juego.esJugable() == true) {
            do {

                juego.tirarDado(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    noGanador = juego.respuestaIncorrecta();
                } else {
                    noGanador = juego.fueRespuestaCorrecta();
                }


            } while (noGanador);
        } else {
            System.out.println("No se puede iniciar la partida con menos de 2 jugadores");
        }
    }

}
