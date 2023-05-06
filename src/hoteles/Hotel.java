package hoteles;

import alojamiento.Alojamiento;

public abstract class Hotel extends Alojamiento {

    public Hotel(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    abstract int cantidadHabitaciones();
    abstract int getNumeroCamas();
    abstract  int getCantidadPisos();
    abstract  double getPrecioHabitacion();


}
