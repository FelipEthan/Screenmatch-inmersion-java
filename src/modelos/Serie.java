package modelos;

import java.util.Scanner;

public class Serie extends Titulo {
    private int temporadas;
    private int episodioPorTemporada;
    private int duracionEnMinutosPorEpisodio;


    @Override
    public int getTiempoDeDuracion() {
      return duracionEnMinutosPorEpisodio * episodioPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

   public void crearSerie() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la serie");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la serie");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
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
        serie.setFechaDeLanzamiento(fechaDeLanzamiento);
        serie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        serie.setEpisodioPorTemporada(episodiosPorTemporada);
        serie.setTemporadas(temporadas);
        serie.muestraFichaTecnica();
    }
}
