package modelos;

public class Titulo{
    private String nombre;
    private int tiempoDeDuracion;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private double evaluacion;
    private String sinopsis;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDeDuracion() {
        return tiempoDeDuracion;
    }

    public void setTiempoDeDuracion(int tiempoDeDuracion) {
        this.tiempoDeDuracion = tiempoDeDuracion;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void muestraFichaTecnica(){
        System.out.println("**********FICHA TECNICA*********");
        System.out.println("Nombre del titulo es: " + getNombre());
        System.out.println("Su fecha de lanzamiento fue: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duración es de: " + getTiempoDeDuracion() + " minutos");

    }
    public void muestraDuracionTotal(){
        System.out.println("El tiempo total para ver tu programa es de: " + getTiempoDeDuracion() + " minutos");

    }
}
