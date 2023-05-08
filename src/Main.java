import alojamiento.Alojamiento;
import consulta.Consulta;
import extraHoteleros.Camping;
import hoteles.Hotel;
import hoteles.Hotel4Estrellas;

public class Main {
    public static void main(String[] args) {
        Alojamiento alojamiento1 = new Alojamiento("venturas", "el sol avenida 1", "norte", "Luisvill");
        Alojamiento hotel1 = new Hotel4Estrellas("el casino",
                "avenida el corazon", "sur",
                "Ayen", 10, 20,
                3, 'A',"gutiMariscos",
                30);
        Alojamiento camping = new Camping("centinela","ruta del sol",
                "norte","el jan","privado",
                60,20,20,
                true);

        Consulta buscar = new Consulta();
        buscar.agregarAlojamientos(alojamiento1);
        buscar.agregarAlojamientos(hotel1);
        buscar.agregarAlojamientos(camping);
        buscar.mostrarAlojamientos();

        buscar.agregarHoteles((Hotel4Estrellas) hotel1);
        buscar.mostrarHotelesPorLocalidad("sur");

        buscar.agregarCampigs((Camping) camping);
        buscar.mostrarCampingsPorLocalidad("norte");
    }
}
