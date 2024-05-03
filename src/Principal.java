import modelos.Calculadora;
import modelos.Pelicula;
import modelos.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    BIENVENIDO A SCREENMATCH
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calculadora de tiempos (Serie)
                    9) Salir
                    Digita una opción
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                     Pelicula pelicula = new Pelicula();
                     pelicula.crearPelicula();
                    break;
                case 2:
                    Serie serie = new Serie();
                    serie.crearSerie();
                    break;
                case 3:
                    Calculadora calculadora = new Calculadora();
                    calculadora.calcularSerie();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;

            }

        }
    }
}
