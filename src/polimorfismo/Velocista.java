
package polimorfismo;


public class Velocista extends Ciclista{
    
    private double potenciaPromedio, velocidadPromedioSprint;

    public Velocista(double potenciaPromedio, int identificador, String nombre) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
    
    
  
    @Override
    public String imprimirTipo(){
        return getNombre() +" es un Velocista";
    }
    
    public void imprimirDatos(){
    
    }
   
   
}

