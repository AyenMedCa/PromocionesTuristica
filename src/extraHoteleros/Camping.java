package extraHoteleros;

public class Camping extends Extrahotelero{
    private int capacidadMaxCarpas;
    private int bañosDisponibles;
    private boolean restaurante;
    public Camping(String nombre, String direccion, String localidad, String gerente, String tipo, int metrosCua,
                   int capacidadMaxCarpas, int bañosDisponibles,
                   boolean restaurante) {
        super(nombre, direccion, localidad, gerente, tipo, metrosCua);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + " Camping[ " +
                "capacidadMaxCarpas: " + capacidadMaxCarpas +
                ", bañosDisponibles: " + bañosDisponibles +
                ", restaurante: " + restaurante +
                ']';
    }
}
