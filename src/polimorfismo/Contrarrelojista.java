package polimorfismo;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(double velocidadMaxima, int identificador, String nombre) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected String imprimirTipo() {
        return getNombre() + " es un Contrarrelojista";
    }

    @Override
    protected void imprimirDatos() {

        System.out.println("Velocidad Maxima (km/h): " + velocidadMaxima);

    }

}