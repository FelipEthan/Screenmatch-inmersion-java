package modelos;

import java.util.Scanner;

public class Pelicula extends Titulo {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public void crearPelicula(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la pelicula");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duracion de minutos de la pelicula");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();
        Pelicula peliculaUsuario = new Pelicula();
        peliculaUsuario.setNombre(nombre);
        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
        peliculaUsuario.setTiempoDeDuracion(duracionEnMinutos);
        peliculaUsuario.muestraFichaTecnica();
    }
}
