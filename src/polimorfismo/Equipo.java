import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private int tiempoTotalEquipo;
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

    public void listarCiclistas() {
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
            total += ciclista.getTiempoAcumulado();
        }
        this.tiempoTotalEquipo = total;
    }
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo Integrador", "Colombia");

        Velocista velocista = new Velocista(400.5, 1, "Santiago");
        velocista.setVelocidadPromedioSprint(60.0);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(3.5f, 8.0f, 2, "Samuel");
        escalador.setTiempoAcumulado(130);

        Contrarrelojista contrarrelojista = new Contrarrelojista(70.0, 3, "Guillermo");
        contrarrelojista.setTiempoAcumulado(115);

        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);
        equipo.calcularTiempoTotal();
        equipo.listarCiclistas();

        System.out.println("Tiempo total del equipo: " + equipo.getTiempoTotalEquipo());
    }
}
