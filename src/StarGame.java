import java.util.Random;
import java.util.Scanner;

public class StarGame {
    Random random = new Random();
    Jugadores jugadores = new Jugadores();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("********EL JUEGO HA COMENZADO********");
        System.out.println("Opciones de selección:");
        System.out.println("[0].-Piedra");
        System.out.println("[1].-Papel");
        System.out.println("[2].-Tijeras");

        System.out.println("Ingresa tu elección");
        System.out.print("Jugador uno: ");
        jugadores.setJugadorUno(scanner.nextInt());

    }

    public int getJugadorUno() {
        return jugadores.getJugadorUno();
    }
}