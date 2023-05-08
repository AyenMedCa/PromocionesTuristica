package hoteles;

public class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantidadSalonesConferencias;
    private int cantidadSuit;
    private int cantidadLimos;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas,
                           int cantidadPisos, char gym,
                           String nombreRestaurante, int capacidadRestaurante,
                           int cantidadSalonesConferencias,
                           int cantidadSuit, int cantidadLimos) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, gym, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencias = cantidadSalonesConferencias;
        this.cantidadSuit = cantidadSuit;
        this.cantidadLimos = cantidadLimos;
    }

    public int getCantidadSalonesConferencias() {
        return cantidadSalonesConferencias;
    }

    public int getCantidadSuit() {
        return cantidadSuit;
    }

    public int getCantidadLimos() {
        return cantidadLimos;
    }

    @Override
    public double getPrecioHabitacion() {
        return super.getPrecioHabitacion() + (15 * cantidadLimos);
    }

}
