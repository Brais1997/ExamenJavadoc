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

        public Grupo[] arrayGrupo;

    /**
     *Builder default.
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
     * @return propietario. return the owner of the passbook.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario The owner of the passbook.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return dni return DNI of the owner.
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni dni of the owner.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return arrayGrupo
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
     *  If there is free hollow a group is added
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
