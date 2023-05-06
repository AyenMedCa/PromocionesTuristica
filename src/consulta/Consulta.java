package consulta;

import alojamiento.Alojamiento;
import extraHoteleros.Camping;
import hoteles.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private List<Alojamiento> alojamientos;
    private List<Hotel> hoteles;
    private List<Camping> campings;

    public Consulta() {
        alojamientos = new ArrayList<>();
        hoteles = new ArrayList<>();
        campings = new ArrayList<>();
    }
    public void agregarAlojamientos(Alojamiento alojamiento){
        alojamientos.add(alojamiento);
    }
    public void mostrarAlojamientos(){
        alojamientos.forEach(alojam -> System.out.println(alojam));
    }
    public void agregarHoteles(Hotel hotel){
        hoteles.add(hotel);
    }
    public void mostrarHotelesPorLocalidad(String localidad){
        hoteles.forEach(hotel -> {
            if (hotel.getLocalidad().equals(localidad)){
                System.out.println(hotel);
            }
        });
    }
    public void agregarCampigs(Camping camping){
        campings.add(camping);
    }
    public void mostrarCampingsPorLocalidad(String localidad){
        campings.forEach(camping -> {
            if (camping.getLocalidad().equals(localidad)){
                System.out.println(camping);
            }
        });
    }
}
