# Trivial
Ejercicio tarea entornos. Juego Carcel

#Problema 0

Extraemos el código duplicado a un unico metodo "nuevaPosicionJugador", al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_1_voy_a_casilla_1"

#Problema 1

Se ha modificado el codigo del metodo "esJugable" y de la clase GameLauncher para que no inicie juego mientras el numero
de jugadores sea menor que 2.

Creamos dos test unitarios:
 -Test : "el_numero_de_jugadores_es_de_menos_de_2_jugadores"
 -Test : "el_numero_de_jugadores_es_de_2_jugadores"
 
 #Problema 2
 
 Se ha modificado el metodo "esJugable" en la clase Game, para que se establezca un maximo de 6 jugadores,
 indicando un mensaje en el caso de que este numero se supere. Asimismo, se ha creado en la clase Game_launcher
 el try_catch para que en el caso de que se lance la excepcion de ArrayOutForBands nos aparezca un mensaje.
 