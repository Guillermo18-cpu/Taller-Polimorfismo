package polimorfismo;

public class Prueba {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Postobon", "Colombia");
        equipo.anadirCiclista(new Velocista(1, "Andres", 450, 60));
        equipo.anadirCiclista(new Escalador(2, "Roberto", 5.2f, 12.5f));
        equipo.anadirCiclista(new Contrarrelojista(3, "Brandon", 70));

        equipo.imprimirDatosEquipo();
        equipo.calcularTiempoTotal();
        equipo.listarNombresCiclistas();
        equipo.imprimirDatosCiclistaPorId(2);

    }
