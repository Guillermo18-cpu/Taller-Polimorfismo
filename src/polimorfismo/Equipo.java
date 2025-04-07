package polimorfismo;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private int tiempoTotalEquipo= 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void listarNombresCiclistas() {
        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista ciclista = ciclistas.get(i);
            ciclista.imprimirDatos();
            System.out.println("Tipo: " + ciclista.imprimirTipo());
            System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + "\n");
        }
    }
    
    public void calcularTiempoTotal() {
        int total = 0;
        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista ciclista = ciclistas.get(i);
            total = total + ciclista.getTiempoAcumulado();
        }
        this.tiempoTotalEquipo = total;
    }
    
    public void imprimirDatosCiclistaPorId (int id){
        for (Ciclista c : ciclistas){
            if (c.getIdentificador()== id){
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontro un con ID " + id);
    }

}
