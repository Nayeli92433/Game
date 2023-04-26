import java.util.Random;
import java.util.Scanner;

public class Selecciones {
    Scanner scanner = new Scanner(System.in);
    Jugadores jugadores = new Jugadores();
    Random rand = new Random();
    StarGame juego = new StarGame();


    public void imprimirSeleccion() {
        int contador = 0;
        int seguir;

        do {
            juego.start();
            int numero = rand.nextInt(3) + 1;
            jugadores.setJugadorUno(numero);
            System.out.println("Jugador dos:");

            if (jugadores.getJugadorDos() == 0) {
                System.out.println("El jugador dos eligio -> Piedra");
            } else if (jugadores.getJugadorDos() == 1) {
                System.out.println("El jugador dos eligio -> Papel");
            } else {
                System.out.println("El jugador dos eligio -> Tijeras");
            }

            int jugadorUno = juego.getJugadorUno();
            if (jugadorUno == 0) {
                System.out.println("El jugador uno eligio -> Piedra");
            } else if (jugadorUno == 1) {
                System.out.println("El jugador uno eligio -> Papel");
            } else {
                System.out.println("El jugador uno eligio -> Tijeras");
            }

            if (jugadorUno < jugadores.getJugadorDos()) {
                System.out.println("GANASTE");
                contador++;

            } else if (jugadores.getJugadorDos() < jugadorUno) {
                System.out.println("PERDISTE");
            } else {

                System.out.println("EMPATE");
            }
            System.out.println("Usted a ganado  " + contador + "  veces");

            System.out.println("----------------------------------------------------");
            System.out.println("Si desea salir del juego ingrese el numero 1 pero si desea continuar ingrese 2");
            seguir = scanner.nextInt();
        } while (seguir != 1);

    }
}

