package segundoTrimestre.Herencia.Colegios;

/**
 * @Author Eneko Lapuente Bascuñana
 * @date 06/02/2024
 * Clase Colegios que representa un colegio genérico.
 */
public class Colegios {
    // Atributos de la clase
    protected String nombre, direccion;
    protected int id;

    // Contadores estáticos para llevar un recuento del número total de colegios, colegios públicos y colegios concertados
    protected static int totalColegios = 0;
    protected static int numPublicos = 0;
    protected static int numConcertados = 0;

    /**
     * Constructor de la clase Colegios.
     *
     * @param nombre    Nombre del colegio.
     * @param direccion Dirección del colegio.
     * @param id        ID del colegio.
     */
    public Colegios(String nombre, String direccion, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        totalColegios++; // Incrementa el contador total de colegios cada vez que se crea una instancia de Colegios
    }

    // Métodos getter y setter para los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getTotalColegios() {
        return totalColegios;
    }

    public static int getNumPublicos() {
        return numPublicos;
    }

    public static int getNumConcertados() {
        return numConcertados;
    }

    /**
     * Método que imprime información sobre el número total de colegios, colegios públicos y colegios concertados.
     */
    public static void infoAdicional() {
        System.out.println("El total de colegios es: " + getTotalColegios());
        System.out.println("El total de colegios publicos es: " + getNumPublicos());
        System.out.println("El total de colegios concertados es: " + getNumConcertados());
    }

    /**
     * Método que devuelve una representación en cadena de la instancia de Colegios.
     *
     * @return Una cadena que representa la instancia de Colegios.
     */
    @Override
    public String toString() {
        return "Colegios{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", id=" + id +
                '}';
    }
}