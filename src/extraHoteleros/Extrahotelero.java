package extraHoteleros;

import alojamiento.Alojamiento;

public class Extrahotelero extends Alojamiento {
    private String tipo;
    private int metrosCua;

    public Extrahotelero(String nombre, String direccion, String localidad, String gerente,
                         String tipo, int metrosCua) {
        super(nombre, direccion, localidad, gerente);
        this.tipo = tipo;
        this.metrosCua = metrosCua;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMetrosCua() {
        return metrosCua;
    }
}
