package segundoTrimestre.Herencia.Colegios;

/**
 * @Author Eneko Lapuente Bascuñana
 * @date 06/02/2024
 * Clase Concertados que representa un colegio concertado.
 * Hereda de la clase Colegios.
 */
public class Concertados extends Colegios {

    // Atributos adicionales que representan la subvención que recibe el colegio concertado y la cuota que se paga en el colegio
    private final double subvencion;
    private final double cuota;

    /**
     * Constructor de la clase Concertados.
     *
     * @param nombre     Nombre del colegio.
     * @param direccion  Dirección del colegio.
     * @param id         ID del colegio.
     * @param subvencion Subvención que recibe el colegio.
     * @param cuota      Cuota que se paga en el colegio.
     */
    public Concertados(String nombre, String direccion, int id, double subvencion, double cuota) {
        super(nombre, direccion, id); // Llamada al constructor de la clase padre
        this.subvencion = subvencion;
        this.cuota = cuota;
        numConcertados++; // Incrementa el contador de colegios concertados cada vez que se crea una instancia de Concertados
    }

    /**
     * Método que devuelve una representación en cadena de la instancia de Concertados.
     *
     * @return Una cadena que representa la instancia de Concertados.
     */
    @Override
    public String toString() {
        return "Concertados{" +
                "subvencion=" + subvencion + "€" +
                ", cuota=" + cuota + "€" +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", id=" + id +
                '}';
    }
}