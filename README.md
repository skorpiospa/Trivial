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
 
 #Problema 3
 
 Se ha modificado el metodo tiraDado para que cuando salga un numero impar al estar en la carcel, salga de ella y se 
 guarde dicho valor para que en la proxima tirada no se quede bloqueado dentro por no actualizarse el estado.
 
 enCasillaCastigo[cuantosJugadores()] = false; 
 
 #Problema 4
 
<<<<<<< HEAD
 Se ha cambiado el No ganador en GameLauncher por Ganador.
=======
 Se ha modificado el nombre de noganador por ganador.
>>>>>>> 6ec5fd0b5f3bfcde7cfd5457ab65139abe778c1e
 
 #Problema 5
 
 Se ha extraido codigo y refactorizado codigo del metodo "fueRespuestaCorrecta", sacado en codigo a un metodo para
 cuando salta al siguiente jugador.

#Problema 6

 Se ha refactorizado codigo que se encontraba dentro del metodo fuerespuestaCorrecta, sacando el codigo que muestra por 
 pantalla la informacion de la respuesta correcta y las monedas que posee a un metodo private.

#Problema 7

 Se ha modificado el codigo del metodo Game el cual contiene un for conntrolando el numero de preguntas realizadas,
eliminando primeramente el metodo que solicitaba preguntas solo de musica y añadiendolo al conjunto de las distintas
sentencias que hacian lo mismo. Igualmente, se ha creado una nueva variable que hace que continuamente sea 0 al llegar 
al maximo establecido de 50, por lo que seguira lanzando preguntas.

 
 
 