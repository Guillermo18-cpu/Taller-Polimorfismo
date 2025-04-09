package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    Scanner sc = new Scanner(System.in);

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
            System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + "(min)\n");
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

    protected void imprimirDatosEquipo() {
        System.out.println("\n");
        System.out.println("Equipo: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("\nLista de Ciclistas:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("ID: " + ciclista.getIdentificador() + " - Nombre: " + ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        System.out.println("\nBuscar Ciclista");
        System.out.print("Digitame el identificador del ciclista que quieres buscar: ");
        int ciclistaSearch = sc.nextInt();

        boolean encontrado = false;

        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == ciclistaSearch) {

                System.out.println("\n");
                System.out.println("Datos del ciclista ");
                System.out.println("ID: " + ciclista.getIdentificador());
                System.out.println("Nombre: " + ciclista.getNombre());
                System.out.println("Equipo: " + nombre);
                System.out.println("Especialidad: " + ciclista.imprimirTipo());
                ciclista.imprimirDatos();
                System.out.println("Tiempo Acumulado (individual): " + ciclista.getTiempoAcumulado() + " minutos");
                System.out.println("\nTiempo Total del Equipo: " + this.getTiempoTotalEquipo() + " minutos");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un ciclista con el ID: " + ciclistaSearch);
        }
    }

}