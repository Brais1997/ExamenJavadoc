package miapp;

import javax.swing.JOptionPane;

/**
 * we have contacts and editing the contacts from this class.
 * @author mmoureperez
 * @version 2.0
 */
public class Grupo {
   
    private String nombreGrupo=pedirNombre();
    public Contacto[] arrayContacto;

    /**
     *Builder default.
     */
    public Grupo()  {
    }

    /**
     *
     * @return nombreGrupo.
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }
    /**
     * In this method the name of the group gets.
     * @return name
     */
public String pedirNombre(){
    String res;
    do{
      res=JOptionPane.showInputDialog("Introduzca el nombre de grupo");
         
      return res;
    }while(res.equals(""));}


    /**
     *
     * @param nombreGrupo name of the group.
     */
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    /**
     *
     * @return arrayContacts.
     */
    public Contacto[] getArrayContacto() {
        return arrayContacto;
    }

    /**
     *
     * @param arrayContacto
     */
    public void setArrayContacto(Contacto[] arrayContacto) {
        this.arrayContacto = arrayContacto;
    }

    /**
     * To add new contact, knowing this free which.
     */
    public void engadirContactoGrupo() {
        
         int libre=cualLibre();
    if(libre<0){
        JOptionPane.showMessageDialog(null,"No hay hueco");
    }                
    else{
       
        String nombre=JOptionPane.showInputDialog("Introduzca el nombre");
        String apellido=JOptionPane.showInputDialog("Introduzca el apellido");
        String telf=JOptionPane.showInputDialog("Introduzca el telefono");
        String email=JOptionPane.showInputDialog("Introduzca el email");  
        
        arrayContacto[libre-1].setNombre(nombre);
        arrayContacto[libre-1].setApellido(apellido);
        arrayContacto[libre-1].setTelf(telf);
        arrayContacto[libre-1].setEmail(email);}
    }

    /**
     *To show all the contacts in a list.
     */
    public void listarContactoGrupo() {
        String lista="";
        
        for(int l=0;l<arrayContacto.length;l++){
            
            if(arrayContacto[l].getNombre().equals("")){}
            else{
                lista=lista+ arrayContacto[l].getId()+arrayContacto[l].toString();
            }
             }
            JOptionPane.showMessageDialog(null,lista);
    }
    
    /**
     *
     * @return the position free.
     */
    public int cualLibre(){
      
        for(int i=0;i<arrayContacto.length;i++){
            
            if(arrayContacto[i].getNombre().equals(""))
            return i;
        }
            return -1;
    }
    }

