package extraHoteleros;

public class Residencia extends Extrahotelero{
    private int cantidadHabitaciones;
    private boolean hacenDescuentos;
    private boolean poseeCampoDeportivo;
    public Residencia(String nombre, String direccion, String localidad, String gerente, String tipo, int metrosCua,
                      int cantidadHabitaciones, boolean hacenDescuentos,
                      boolean poseeCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, tipo, metrosCua);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.hacenDescuentos = hacenDescuentos;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean isHacenDescuentos() {
        return hacenDescuentos;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }
}
