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
        return "Contrarrelojista" + getNombre();
    }

    @Override
    protected void imprimirDatos() {

        super.imprimirDatos();
        System.out.println("Velocidad Máxima (km/h): " + velocidadMaxima);

    }

}
