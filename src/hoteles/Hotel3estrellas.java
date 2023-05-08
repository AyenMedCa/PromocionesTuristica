package hoteles;

public class Hotel3estrellas extends Hotel{
    private Integer cantidadHabitaciones;
    private Integer numeroCamas;
    private Integer cantidadPisos;

    public Hotel3estrellas(String nombre, String direccion, String localidad, String gerente,
                           int cantidadHabitaciones, int numeroCamas,
                           int cantidadPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public int cantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    @Override
    public int getNumeroCamas() {
        return numeroCamas;
    }

    @Override
    public int getCantidadPisos() {
        return cantidadPisos;
    }

    @Override
    public double getPrecioHabitacion() {
        return 50 + (1*cantidadHabitaciones);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
