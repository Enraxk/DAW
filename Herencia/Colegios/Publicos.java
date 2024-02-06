package segundoTrimestre.Herencia.Colegios;

/**
 * @Author Eneko Lapuente Bascuñana
 * @date 06/02/2024
 * Clase Publicos que representa un colegio público.
 * Hereda de la clase Colegios.
 */
public class Publicos extends Colegios {

    // Atributo adicional que representa la subvención que recibe el colegio público
    private final double subvencion;

    /**
     * Constructor de la clase Publicos.
     *
     * @param nombre     Nombre del colegio.
     * @param direccion  Dirección del colegio.
     * @param id         ID del colegio.
     * @param subvencion Subvención que recibe el colegio.
     */
    public Publicos(String nombre, String direccion, int id, double subvencion) {
        super(nombre, direccion, id); // Llamada al constructor de la clase padre
        this.subvencion = subvencion;
        numPublicos++; // Incrementa el contador de colegios públicos cada vez que se crea una instancia de Publicos
    }

    /**
     * Método que devuelve una representación en cadena de la instancia de Publicos.
     *
     * @return Una cadena que representa la instancia de Publicos.
     */
    @Override
    public String toString() {
        return "Publicos{" +
                "subvencion=" + subvencion + "€" +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", id=" + id +
                '}';
    }
}