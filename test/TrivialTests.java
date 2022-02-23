
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {


    @Test
    public void crear_Game() {
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_la_casilla_1() {
        //Preparación
        Game juego = new Game();
        juego.agregar("Maria");
        juego.agregar("Juan");

        juego.tirarDado(1);
        String mensajePosicion = "La nueva posición de Maria es 1";
        //Ejecucion
        String result = juego.nuevaPosicionJugador();
        //Comprobación
        Assertions.assertEquals(mensajePosicion, result);
    }


    @Test
    public void el_numero_de_jugadores_es_de_menos_de_2_jugadores() {
        //Preparación
        Game juego = new Game();
        juego.agregar("Javier");
        //Ejecucion
        boolean resultMenor2Jugadores = juego.esJugable();
        //Comprobacion
        Assertions.assertEquals(false, resultMenor2Jugadores);
    }

    @Test
    public void el_numero_de_jugadores_es_de_2_jugadores() {
        //Preparación
        Game juego = new Game();
        juego.agregar("Javier");
        juego.agregar("Maria");
        //Ejecucion
        boolean result = juego.esJugable();
        //Comprobacion
        Assertions.assertEquals(true, result);
    }

    @Test()
    public void el_numero_maximo_jugadores_son_6() {
        //Preparacion
        Game juego = new Game();
        juego.agregar("Javier");
        juego.agregar("Javier");
        juego.agregar("Javier");
        juego.agregar("Javier");
        juego.agregar("Javier");
        juego.agregar("Javier");

        //Ejecucion
        boolean result = juego.esJugable();
        Assertions.assertTrue(result);
    }

    @Test()
    public void el_numero_maximo_jugadores_ha_sido_superado() throws ArrayIndexOutOfBoundsException {
        //Preparacion
        Game juego = new Game();
        try {
            juego.agregar("Javier");
            juego.agregar("Javier");
            juego.agregar("Javier");
            juego.agregar("Javier");
            juego.agregar("Javier");
            juego.agregar("Javier");
            juego.agregar("Javier");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ha superado el limite de 6 jugadores, por lo que mantendremos el maximo para empezar la partida");
        }
        //Ejecucion, tiene que dar el error de ArrayIndexOutofBound.
        juego.esJugable();
    }

    @Test()
    public void no_se_ha_alcanzado_el_minimo_de_jugadores_ha_sido_superado() throws ArrayIndexOutOfBoundsException {
        //Preparacion
        Game juego = new Game();
        try {
            juego.agregar("Javier");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede iniciar la partida con menos de 2 jugadores");
        }

        //Ejecucion  --
        juego.esJugable();
    }

    @Test
    public void comprobacion_entra_y_sale_de_la_carcel (){

        Game juego=new Game();

        juego.agregar("Javier");
        juego.agregar("Maria");
        juego.esJugable();
        juego.tirarDado(4);
        juego.fueRespuestaCorrecta();
        juego.tirarDado(2);
        juego.fueRespuestaCorrecta();
        juego.tirarDado(3);
        juego.respuestaIncorrecta();
        juego.tirarDado(1);
        juego.respuestaIncorrecta();
        juego.tirarDado(1);
        juego.fueRespuestaCorrecta();
        juego.tirarDado(3);
        juego.fueRespuestaCorrecta();
        juego.tirarDado(5);
        juego.fueRespuestaCorrecta();
        juego.tirarDado(2);
        juego.fueRespuestaCorrecta();

        // Se comprueba en el codigo que una vez ha salido de la carcel no vuelve a aparecer como que se encuentra en ella.

    }

    @Test
    public void respuesta_correcta_mensaje_monedas_y_siguiente_jugador () {
        //Preparacion
        Game juego=new Game();
        juego.agregar("Juan");
        juego.agregar("Laura");
        juego.tirarDado(3);
        //Ejecucion
        juego.fueRespuestaCorrecta();
        //Comprobacion
        Assertions.assertTrue(juego.fueRespuestaCorrecta());
    }


}

