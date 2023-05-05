public abstract class Hotel4Estrellas extends Hotel3estrellas{
    private char gym;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Double precioHabitaciones, char gym, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
}
