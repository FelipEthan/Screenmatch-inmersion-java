package modelos;
import java.util.Scanner;
public class Calculadora {
    public void calcularSerie() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la serie");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la duracion de minutos por episodio");
        int duracionEnMinutosPorEpisodio = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese los episodios por temporada");
        int episodiosPorTemporada = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la cantidad de temporadas");
        int temporadas = teclado.nextInt();
        teclado.nextLine();
        Serie serie = new Serie();
        serie.setNombre(nombre);
        serie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        serie.setEpisodioPorTemporada(episodiosPorTemporada);
        serie.setTemporadas(temporadas);
        serie.muestraDuracionTotal();
    }
}
