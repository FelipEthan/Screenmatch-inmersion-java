import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");

        //Declaración de variables
        int fechaDeLanzamiento = 2015;
        double evaluacion = 4.5;
        boolean incluidoEnElPlan = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix la mejor pelicula del fin del milenio
                me encanto mucho la pelicula.""";
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        double mediaMatrix = 0;


        //Para imprimir en pantalla
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("Breve sinopsis: " + sinopsis);
        System.out.println("Su fecha de lanzamiento fue: " + fechaDeLanzamiento);
        System.out.println("Su calificación es de: " + evaluacion);
        System.out.println("Esta incluido en tu plan? : " + incluidoEnElPlan);
        System.out.println("Su promedio de calificación es de: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 1999){
            System.out.println("Pelicula popular del momento");
        }else {
            System.out.println("Pelicula retro fea");
    }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le das a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaMatrix += notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada es: " + mediaMatrix / 3);
}

}