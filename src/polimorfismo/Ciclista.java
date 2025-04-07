package polimorfismo;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected abstract String imprimirTipo();

    protected void imprimirDatos() {
        System.out.println("-----------------------------------\n");
        System.out.println("Identificador: " + getIdentificador());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tiempo Acumulado: " + getTiempoAcumulado() + "(min) ");
        System.out.println("-----------------------------------\n");
    }

}
