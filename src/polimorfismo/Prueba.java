package polimorfismo;

public class Prueba {

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
        equipo.listarNombresCiclistas();
        equipo.imprimirDatosCiclistaPorId(3);

        System.out.println("Tiempo total del equipo: " + equipo.getTiempoTotalEquipo());
    }
}