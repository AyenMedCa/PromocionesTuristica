package hoteles;

public class Hotel4Estrellas extends Hotel3estrellas {
    private char gym;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                           int numeroCamas, int cantidadPisos,
                           char gym, String nombreRestaurante,
                           int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gym = gym;
        this.capacidadRestaurante = capacidadRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }


    public char getGym() {
        return gym;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public double getPrecioHabitacion() {
        return 50 + (1 * cantidadHabitaciones()) + (valoraAgregadoRest()) + (valorAgregadoGym());
    }

    public double valoraAgregadoRest() {
        if (capacidadRestaurante < 30) return 10;
        if (capacidadRestaurante >= 30 || capacidadRestaurante <= 50) return 30;
        if (capacidadRestaurante > 50) return 50;
        return 0;
    }

    public double valorAgregadoGym() {
        if (gym == 'A') return 50;
        if (gym == 'B') return 30;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+ " Hotel4Estrellas[ " +
                "gym: " + gym +
                ", nombreRestaurante: '" + nombreRestaurante + '\'' +
                ", capacidadRestaurante: " + capacidadRestaurante +
                " habitaciones: " + cantidadHabitaciones()+
                " camas: " + getNumeroCamas()+
                ']';
    }
}
