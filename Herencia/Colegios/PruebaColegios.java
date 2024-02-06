package segundoTrimestre.Herencia.Colegios;

import java.util.Scanner;

/**
 * @Author Eneko Lapuente Bascuñana
 * @date 06/02/2024
 * Clase principal del programa.
 */
public class PruebaColegios {

    /**
     * Punto de entrada del programa.
     */
    public static void main(String[] args) {
        // Creación de un Scanner para la entrada de datos por teclado
        Scanner sc = new Scanner(System.in);

        // Creación de una instancia de un colegio público
        Publicos IES_CIUDAD_ESCOLAR = new Publicos("IES", "Calle", 1, 1000);

        // Creación de una instancia de un colegio concertado
        Concertados ABACO = new Concertados("IES", "Calle", 1, 1000, 100);

        // Impresión de la información de los colegios
        System.out.println(IES_CIUDAD_ESCOLAR);
        System.out.println(ABACO);

        // Creación de colegios a partir de la entrada del usuario
        infromacionPorTeclado(sc);

        // Impresión de la información adicional de los colegios
        Colegios.infoAdicional();

        // Cierre del Scanner
        sc.close();
    }

    /**
     * Método que crea colegios a partir de la entrada del usuario.
     */
    public static void infromacionPorTeclado(Scanner a) {
        // Obtención de los datos del colegio
        Resultado resultado = Menu(a);

        // Creación de una instancia del colegio correspondiente
        switch (a.nextInt()) {
            case 1:
                Publicos(a, resultado);
                break;
            case 2:
                Concertados(a, resultado);
        }
    }

    /**
     * Método que crea una instancia de un colegio público a partir de la entrada del usuario.
     */
    private static void Publicos(Scanner a, Resultado resultado) {
        System.out.println("Introduce la subvencion del colegio Type double:z");
        double subvencion = a.nextDouble();
        Publicos publico = new Publicos(resultado.nombre(), resultado.direccion(), resultado.id(), subvencion);
        System.out.println(publico);
    }

    /**
     * Método que crea una instancia de un colegio concertado a partir de la entrada del usuario.
     */
    private static void Concertados(Scanner a, Resultado resultado) {
        System.out.println("Introduce la subvencion del colegio Type double:");
        double subvencion2 = a.nextDouble();
        System.out.println("Introduce la cuota del colegio Type double:");
        double cuota = a.nextDouble();
        Concertados concertados = new Concertados(resultado.nombre(), resultado.direccion(), resultado.id(), subvencion2, cuota);
        System.out.println(concertados);
    }

    /**
     * 06/02/2024
     * Método que solicita al usuario que introduzca los datos del colegio.
     */
    private static Resultado Menu(Scanner a) {
        System.out.println("Introduce el nombre del colegio Type String:");
        String nombre = a.nextLine();
        System.out.println("Introduce la direccion del colegio Type String:");
        String direccion = a.nextLine();
        System.out.println("Introduce el id del colegio Type int:");
        int id = a.nextInt();
        System.out.println("Introduce el tipo de colegio:");
        System.out.println("1. Publico");
        System.out.println("2. Concertado");
        return new Resultado(nombre, direccion, id);
    }

    /**
     * Clase de registro que contiene el nombre, la dirección y el id del colegio.
     */
    private record Resultado(String nombre, String direccion, int id) {
    }
}