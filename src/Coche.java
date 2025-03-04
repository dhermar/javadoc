/**
 * La clase Coche representa un coche con marca y modelo. Permite obtener
 * información sobre el coche y realizar operaciones relacionadas.
 *
 * @author Diego Hernández
 * @version 1.0
 * @since 2025-03-04
 */
public class Coche {

    /**
     * La marca del coche.
     */
    private String marca;

    /**
     * El modelo del coche.
     */
    private String modelo;

    /**
     * Constructor para crear un coche con una marca y modelo específicos.
     *
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     */
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return La marca del coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece una nueva marca para el coche.
     *
     * @param marca La nueva marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del coche.
     *
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece un nuevo modelo para el coche.
     *
     * @param modelo El nuevo modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Muestra la información del coche en formato de cadena.
     *
     * @return Una cadena con la marca y el modelo del coche.
     * @see Coche#getMarca()
     * @see Coche#getModelo()
     */
    public String informacionCoche() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }

    /**
     * Método principal que crea objetos de las clases Persona y Coche.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     * @since 2025-03-04
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        System.out.println(persona.descripcion());

        Coche coche = new Coche("Toyota", "Corolla");
        System.out.println(coche.informacionCoche());
    }
}
