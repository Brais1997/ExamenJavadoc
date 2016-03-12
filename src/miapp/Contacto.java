package miapp;
/**
 * we have the attributes contacts.
 * @author mmoureperez
 * @version 2.0
 */
public class Contacto {

    private int id;

    private String nombre;

    private String apellido;

    private String telf;

    private String email;

    /**
     *
     */
    public Contacto() {
    }
/**
 * 
 * @param id It introduces the values of id.
 * @param nombre It introduces the values of name.
 * @param apellido It introduces the values of surname.
 * @param telf It introduces the values of phone.
 * @param email  It introduces the values of e-mail.
 */
    public Contacto(int id, String nombre, String apellido, String telf, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telf = telf;
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return surname
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return telephone
     */
    public String getTelf() {
        return telf;
    }

    /**
     *
     * @param telf
     */
    public void setTelf(String telf) {
        this.telf = telf;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String texto;
        
        texto="Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telf=" + telf + ", email=" + email + '}';
    return texto;
    }
    
}
