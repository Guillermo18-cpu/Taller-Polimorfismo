package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    static Scanner sc = new Scanner(System.in);

    private String nombre;
    private String pais;
    private int tiempoTotalEquipo = 0;

    public String getNombreEquipo() {
        return nombre;
    }

    protected void setNombreEquipo(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
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

    public void imprimirDatosCiclistaPorId(int id) {
        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista ciclista = ciclistas.get(i);
            if (ciclista.getIdentificador() == id) {
                ciclista.imprimirDatos();
            }
        }
        System.out.println("No se encontro un ciclista con el ID: " + id);
    }

    protected void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total acumulado: " + tiempoTotalEquipo + " minutos");
    }

    void buscarCiclista() {
        System.out.println("\nBuscar Ciclista");
        System.out.println("Digitame el identificador del ciclista que quieres buscar: ");

        int ciclistaSearch = sc.nextInt();

        int validacion = 0;
        boolean bandera = false;

        for (int i = 0; i < ciclistas.size(); i++) {
            if (ciclistaSearch == ciclistas.get(i).getIdentificador()) {
                validacion = i;
                bandera = true;
            }
        }

        if (bandera == true) {
            System.out.println("El nombre del ciclista es: " + ciclistas.get(validacion).getNombre());
        } else {
            System.out.println("El ciclsita no esta registrado");
        }
    }
}
