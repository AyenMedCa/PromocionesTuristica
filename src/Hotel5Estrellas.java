public class Hotel5Estrellas extends Hotel4Estrellas{

    private int cantidadSalonesConferencias;
    private int cantidadSuit;
    private int cantidadLimos;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Double precioHabitaciones, char gym, String nombreRestaurante, int capacidadRestaurante, int cantidadSalonesConferencias, int cantidadSuit, int cantidadLimos) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, gym, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencias = cantidadSalonesConferencias;
        this.cantidadSuit = cantidadSuit;
        this.cantidadLimos = cantidadLimos;
    }

    public int getCantidadSalonesConferencias() {
        return cantidadSalonesConferencias;
    }

    public void setCantidadSalonesConferencias(int cantidadSalonesConferencias) {
        this.cantidadSalonesConferencias = cantidadSalonesConferencias;
    }

    public int getCantidadSuit() {
        return cantidadSuit;
    }

    public void setCantidadSuit(int cantidadSuit) {
        this.cantidadSuit = cantidadSuit;
    }

    public int getCantidadLimos() {
        return cantidadLimos;
    }

    public void setCantidadLimos(int cantidadLimos) {
        this.cantidadLimos = cantidadLimos;
    }
}
