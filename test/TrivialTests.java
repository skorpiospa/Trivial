import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_la_casilla_1 (){
        //Preparación
        Game juego=new Game();
        juego.agregar("Maria");
        juego.agregar("Juan");

        juego.tirarDado(1);
        String mensajePosicion="La nueva posición de Maria es 1";
        //Ejecucion
        String result=juego.nuevaPosicionJugador();
        //Comprobación
        Assert.assertEquals(mensajePosicion,result);
    }


    @Test
    public void el_numero_de_jugadores_debe_ser_de_al_menos_2_jugadores () {
        //Preparación
        Game juego=new Game();
        juego.agregar("Javier");


    }
}
