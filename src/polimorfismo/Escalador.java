
package polimorfismo;

public class Escalador extends Ciclista{
    private float aceleracionPromedio, gradoRampa;

    public Escalador(float aceleracionPromedio, float gradoRampa, int identificador, String nombre) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo(){
    return getNombre() +" es un Escalador";
    }

   
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleracion promedio: "+aceleracionPromedio+ " m/s^2");
        System.out.println("Grado de rampa soportada: "+gradoRampa+ " grados");
    
    }
}

