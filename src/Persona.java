/**
 * La clase Persona representa a una persona con un nombre y una edad.
 * Esta clase permite obtener la información de la persona y modificarla.
 *
 * @author Diego Hernández
 * @version 1.0
 * @since 2025-03-04
 */
public class Persona {

    /**
     * El nombre de la persona.
     */
    private String nombre;

    /**
     * La edad de la persona.
     */
    private int edad;

    /**
     * Constructor para crear una persona con un nombre y edad específicos.
     *
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para la persona.
     *
     * @param edad La nueva edad de la persona.
     * @deprecated Este método está desactualizado, usa setEdadV2() en su lugar.
     */
    @Deprecated
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Establece una nueva edad para la persona.
     *
     * @param edad La nueva edad de la persona.
     * @since 2025-03-04
     */
    public void setEdadV2(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve una descripción de la persona en formato de cadena.
     *
     * @return Una cadena con el nombre y la edad de la persona.
     * @see Persona#getNombre()
     * @see Persona#getEdad()
     */
    public String descripcion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
