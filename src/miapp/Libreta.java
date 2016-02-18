package miapp;

import javax.swing.JOptionPane;

/**
 * we have the groups of contacts, editing the groups from this class.
 *
 * @author mmoureperez
 * @version 2.0
 */
public class Libreta {

    private String propietario, dni;

    /**
     *
     */
    public Grupo[] arrayGrupo;

    /**
     *
     */
    public Libreta() {
    }

    /**
     *
     * @param propietario It introduces the values of Owner.
     * @param dni it introduces the values of DNI.
     */
    public Libreta(String propietario, String dni) {
        this.propietario = propietario;
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public Grupo[] getArrayGrupo() {
        return arrayGrupo;
    }

    /**
     *
     * @param arrayGrupo
     */
    public void setArrayGrupo(Grupo[] arrayGrupo) {
        this.arrayGrupo = arrayGrupo;
    }

    /**
     *
     * @return the position free.
     *  
     */
    public int cualLibreGrupo() {

        for (int i = 0; i < arrayGrupo.length; i++) {

            if (arrayGrupo[i].getNombreGrupo().equals("")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * to add a new group, knowing this free which.
     */
    public void engadirGrupo() {
        int libre = cualLibreGrupo();
        if (libre < 0) {
            JOptionPane.showMessageDialog(null, "No hay hueco");
        } else {

            String nombre = JOptionPane.showInputDialog("Introduzca el nombre");

            arrayGrupo[libre - 1].setNombreGrupo(nombre);

        }
    }
    /**
     * To show all the group in a list.
     *
     */
    public void listarGrupo() {
        String lista = "";

        for (int l = 0; l < arrayGrupo.length; l++) {

            if (arrayGrupo[l].getNombreGrupo().equals("")) {
            } else {
                lista = lista + arrayGrupo[l].getNombreGrupo() + arrayGrupo[l].toString();
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }
    /**
     *
     * @param nombre Name of the contact that wants to resign.
     */
    public void borrarGrupo(String nombre) {
            for(int i=0;i<arrayGrupo.length;i++){
                if(arrayGrupo[i].getNombreGrupo().equals(nombre))
                    arrayGrupo[i].setNombreGrupo("");
                
            }
    }

    @Override
    public String toString() {
        return "Libreta{" + "propietario=" + propietario + ", dni=" + dni + ", arrayGrupo=" + arrayGrupo + '}';
    }



    
    
}
